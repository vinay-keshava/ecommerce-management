package com.training.ecommerce.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	
	private double orderTotal;
	
	private String addresss;
	
	@CreationTimestamp
	private LocalDateTime localDateTime;
	
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
	private List<Products> products;

}
