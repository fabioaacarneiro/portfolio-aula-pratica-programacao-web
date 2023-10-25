package com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.resource.exceptions;

import com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardError err = new StandardError(
                new Date(),
                status,
                e.getMessage(),
                "User is not found or does not exist",
                request.getRequestURI());

        return new ResponseEntity<StandardError>(err, status);
    }
}
