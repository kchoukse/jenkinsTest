package com.restdemo.error;

import org.springframework.http.HttpStatus;

public class ApiError {
    private HttpStatus errorCode;
    private String errorMessage;

 

    public ApiError(HttpStatus notFound, String errorMessage) {
        super();
        this.errorCode = notFound;
        this.errorMessage = errorMessage;
    }

 

    public HttpStatus getErrorCode() {
        return errorCode;
    }

 

    public void setErrorCode(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

 

    public String getErrorMessage() {
        return errorMessage;
    }

 

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

 

}
