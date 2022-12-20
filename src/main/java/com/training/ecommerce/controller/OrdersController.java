package com.training.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.ecommerce.entity.Orders;
import com.training.ecommerce.service.impl.OrderServiceImpl;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	OrderServiceImpl orderServiceImpl;
	
	@PostMapping("/")
	public ResponseEntity<Orders> newCustomer(@Valid @RequestBody Orders orders) {
		return new ResponseEntity<>(orderServiceImpl.newOrders(orders),HttpStatus.OK);
	}
	
}
