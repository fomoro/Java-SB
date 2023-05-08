package com.linktic.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.linktic.application.DTOs.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException) {
		String mensaje = resourceNotFoundException.getMessage();

		//lombok
		//ApiResponse response = new ApiResponse().builder().message(mensaje).success(true).status(HttpStatus.NOT_FOUND).build();
		ApiResponse response = new ApiResponse();
		response.setMessage(mensaje);
		response.setSuccess(true);
		response.setStatus(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

}
