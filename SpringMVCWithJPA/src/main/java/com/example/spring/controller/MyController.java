package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring.model.Student;
import com.example.spring.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class MyController {
	@Autowired
	StudentService studentService;
	@RequestMapping("/home")
	public String gethome()
	{
		//System.out.println(jdbcTemplate);
		return "home";
	}
	@RequestMapping("/form")
	public ModelAndView getform()
	{
		return new ModelAndView("stuform","command",new Student());
	}
	@RequestMapping(value="/processform2", method = RequestMethod.POST)
	public String getstudent2(@Valid @ModelAttribute("command")  Student stu, BindingResult result)
	{
		if(result.hasErrors()) {
			return "stuform";
		}
		studentService.save(stu);
		return "redirect:/home";
	}
	public ModelAndView getstudent(int id)
	{
		return new ModelAndView("home","stu",studentService.get(id));
	}
	@RequestMapping("/stu")
	public ModelAndView getstudents()
	{
		return new ModelAndView("studetails","list",studentService.getAll());
	}
	@RequestMapping("delstu/{id}")
	public String deletestudent(@PathVariable int id)
	{
		studentService.delete(id);
		return "redirect:/stu";
	}
	@RequestMapping("stu/{id}")
	public ModelAndView editstudent(@PathVariable int id)
	{
		 return new ModelAndView("editstu","student",studentService.get(id));
	}
	@RequestMapping("/updatestu")
	public String updatestudent(@ModelAttribute Student stu)
	{
		studentService.update(stu);
		return "redirect:/stu";
	}
}