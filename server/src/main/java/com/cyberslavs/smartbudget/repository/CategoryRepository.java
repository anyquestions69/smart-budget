package com.cyberslavs.smartbudget.repository;

import com.cyberslavs.smartbudget.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
