package com.training.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	private String productName;
	
	private double price;
	

}
