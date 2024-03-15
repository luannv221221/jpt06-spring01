package com.ra.springboot01.controller;

import com.ra.springboot01.model.entity.Category;
import com.ra.springboot01.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("")
    public String index(Model model){
        List<Category> list = categoryService.getAll();
        model.addAttribute("list",list);
        return "category/index";
    }

    @GetMapping("/add")
    public String add(Category category,Model model){
        model.addAttribute("category",category);
        return "category/add";
    }
    @PostMapping("/add")
    public String create(@ModelAttribute("category") Category category){
        categoryService.save(category);
        return "redirect:/category";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Category category = categoryService.findById(id);
        model.addAttribute("category",category);
        return "category/edit";
    }
    @PostMapping("/edit/{id}")
    public String update(@ModelAttribute("category") Category category){
        categoryService.save(category);
        return "redirect:/category";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        categoryService.delete(id);
        return "redirect:/category";
    }
}
