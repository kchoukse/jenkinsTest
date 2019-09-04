package com.restdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restdemo.error.ApiError;
import com.restdemo.exception.DepartmentException;

@ControllerAdvice
public class ExceptionHandlerController {
    
    @ExceptionHandler(DepartmentException.class)
    public @ResponseBody ApiError handleDepartmentException(DepartmentException departmentException) {
        return new ApiError(HttpStatus.NOT_FOUND,departmentException.getMessage());

 

    }
}