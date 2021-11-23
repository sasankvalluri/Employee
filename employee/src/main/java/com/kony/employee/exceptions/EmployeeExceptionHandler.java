package com.kony.employee.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeException ine){
        EmployeeErrorResponse errorResponse = new EmployeeErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(ine.getMessage());
        //errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<EmployeeErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(Exception ex){
        EmployeeErrorResponse errorResponse = new EmployeeErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(ex.getMessage());
        //errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<EmployeeErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
