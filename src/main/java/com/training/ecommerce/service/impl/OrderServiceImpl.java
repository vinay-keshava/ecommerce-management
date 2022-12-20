package com.training.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.ecommerce.entity.Orders;
import com.training.ecommerce.repository.OrdersRepository;
import com.training.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrdersRepository orderRepository;
	
	public Orders newOrders(Orders orders) {
		return orderRepository.save(orders);
	}
}
