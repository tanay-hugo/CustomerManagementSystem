package com.tanay.cms.api;

import com.tanay.cms.exception.ApplicationError;
import com.tanay.cms.exception.CustomerNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler{
    @ExceptionHandler(CustomerNotFound.class)
    public ResponseEntity<ApplicationError> handleCustomerNotFoundException(CustomerNotFound exception, WebRequest webrequest){
        ApplicationError error  = new ApplicationError();
        error.setCode(101);
        error.setMessage(exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
