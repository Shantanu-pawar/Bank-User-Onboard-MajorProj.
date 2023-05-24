package com.banking.Onboard.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/* Create employee rest API to store data in our table
 *  
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)  
public class resourceNotFoundException extends RuntimeException {
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	
	
	public resourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourceName ,fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName () {
		return resourceName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}
	
}
