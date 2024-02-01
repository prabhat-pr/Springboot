package com.cdac.Lab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String home(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("products", productList);
        return "home";
    }

    @GetMapping("/addProduct")
    public String addProductForm() {
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/";
    }

    @GetMapping("/editProduct/{id}")
    public String editProductForm(@PathVariable Long id, Model model) {
        Product product = getProductById(id);
        model.addAttribute("product", product);
        return "editProduct";
    }

    @PostMapping("/editProduct/{id}")
    public String editProduct(@PathVariable Long id, @ModelAttribute Product product) {
        Product existingProduct = getProductById(id);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());

        productRepository.save(existingProduct);
        return "redirect:/";
    }

    @GetMapping("/viewProduct/{id}")
    public String viewProduct(@PathVariable Long id, Model model) {
        Product product = getProductById(id);
        model.addAttribute("product", product);
        return "viewProduct";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProductForm(@PathVariable Long id, Model model) {
        Product product = getProductById(id);
        model.addAttribute("product", product);
        return "confirmDelete";
    }

    @PostMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/";
    }
    private Product getProductById(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        return product;
    }
}