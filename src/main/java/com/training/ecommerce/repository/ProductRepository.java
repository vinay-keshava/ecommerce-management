package com.training.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.ecommerce.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{

}
