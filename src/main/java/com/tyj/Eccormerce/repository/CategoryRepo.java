package com.tyj.Eccormerce.repository;

import com.tyj.Eccormerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
