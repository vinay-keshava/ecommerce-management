package com.training.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.ecommerce.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{

}
