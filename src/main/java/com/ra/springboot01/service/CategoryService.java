package com.ra.springboot01.service;

import com.ra.springboot01.model.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> getAll();
    Category save(Category category);
    Category findById(Long id);
    void  delete(Long id);
}
