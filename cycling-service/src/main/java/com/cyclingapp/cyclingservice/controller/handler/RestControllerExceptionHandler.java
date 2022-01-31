package com.cyclingapp.cyclingservice.controller.handler;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cyclingapp.cyclingservice.dto.ErrorResponseDTO;
import com.cyclingapp.cyclingservice.exceptions.NotFoundException;

@RestController
@ControllerAdvice
public class RestControllerExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler({NotFoundException.class})
	public final ResponseEntity<ErrorResponseDTO> handleNotFoundException(Exception ex) throws Exception {
		ErrorResponseDTO error = new ErrorResponseDTO();
		error.setErrorCode(NOT_FOUND.value());
		error.setErrorMsg(ex.getMessage());
		error.setTimestamp(new Date());
		
		return new ResponseEntity<ErrorResponseDTO>(error, new HttpHeaders(), NOT_FOUND);
	}

}
