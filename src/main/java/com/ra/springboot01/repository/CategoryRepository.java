package com.ra.springboot01.repository;

import com.ra.springboot01.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
