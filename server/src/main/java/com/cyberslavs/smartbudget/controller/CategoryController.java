package com.cyberslavs.smartbudget.controller;

import com.cyberslavs.smartbudget.model.Category;
import com.cyberslavs.smartbudget.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;
    @GetMapping
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    @PostMapping
    public String create(@RequestBody Category category){
        categoryRepository.save(new Category(category.getName()));
        return "Successfully created";
    }

}
