package com.cg.exception;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cg.dto.ErrorDTO;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice //-----make it global so that can handle exception of all controllers
public class GlobalExceptionHandler {
	@ResponseBody
	@ExceptionHandler({EmployeeNotFoundException.class})
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorDTO handleException(EmployeeNotFoundException e,HttpServletRequest request) {
		return new ErrorDTO(e.getMessage(),LocalDate.now(),request.getRequestURI());
	}
	
	@ResponseBody
	@ExceptionHandler({MethodArgumentNotValidException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public Map<String,ErrorDTO> handleException1(MethodArgumentNotValidException e,HttpServletRequest request) {
		List<ObjectError> errors =  e.getBindingResult().getAllErrors();
		Map<String, ErrorDTO> m = new HashMap<String, ErrorDTO>();
		for(ObjectError o : errors) {
			String fieldName = ((FieldError)o).getField();  //Represents error specific to a field
			m.put(fieldName, new ErrorDTO(o.getDefaultMessage(),LocalDate.now(),request.getRequestURI()));
			
		}
		return m;
	}
	
	@ResponseBody
	@ExceptionHandler({DateTimeParseException.class})  //If user sends invalid date format → Spring throws exception → this method catches it and returns structured error.
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorDTO handleException(DateTimeParseException e,HttpServletRequest request) {
		return new ErrorDTO(e.getMessage(),LocalDate.now(),request.getRequestURI());
	}
	
	@ResponseBody
	@ExceptionHandler({Exception.class})
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorDTO handleException(Exception e,HttpServletRequest request) {
		return new ErrorDTO(e.getMessage(),LocalDate.now(),request.getRequestURI());
	}
}
