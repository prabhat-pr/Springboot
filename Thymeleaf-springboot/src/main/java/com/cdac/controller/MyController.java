package com.cdac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("name", "");
        model.addAttribute("email", "");
        return "form";
    }
    
    @PostMapping("/submit")
    public String submitForm() {
        return "redirect:/success";
    }
}
