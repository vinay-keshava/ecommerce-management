package com.training.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.ecommerce.entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Long>{

}
