package com.training.ecommerce.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	@Min(value = 18,message = "Age should be greater than or equal to 18")
	private int age;
	
	private String address;
	
	private int pinCode;
	
	@NotNull
	@Pattern(regexp = "[6-9][0-9]{9}", message = "Please enter Valid Indian Phone Number")
	private String phoneNumber;
	
	@Email(message = "Please Enter Valid email", regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+$")
	@NotNull
	@Column(unique = true)
	private String email;
	
	
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
	private List<Orders> orders;
	

}
