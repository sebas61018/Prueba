package com.ufpso.tienda.repository;

import com.ufpso.tienda.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryModel,Long> {
    Optional<CategoryModel> findByNameCategory(String nameCategory);

}