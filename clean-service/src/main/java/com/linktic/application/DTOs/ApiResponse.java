package com.linktic.application.DTOs;

//import lombok.*;
import org.springframework.http.HttpStatus;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
public class ApiResponse {

    private String message;
    private boolean success;
    private HttpStatus status;
         
	public ApiResponse() {		
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

    
}