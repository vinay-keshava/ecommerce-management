package com.training.ecommerce.exception;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

	private List<String> messages;
		
	public ErrorResponse(List<String> messages) {
		this.messages=messages;
	}
	
	
}
