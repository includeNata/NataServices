package com.server.nata_service.controllers.handlers;

import com.server.nata_service.dto.CustomError;
import com.server.nata_service.dto.ValidationError;
import com.server.nata_service.services.exceptions.DatabaseException;
import com.server.nata_service.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)

    public ResponseEntity<CustomError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        CustomError err =new CustomError(Instant.now(),status.value(),e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<CustomError> dataBaseException(DatabaseException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        CustomError err =new CustomError(Instant.now(),status.value(),e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CustomError> methodArgumentNotValid(MethodArgumentNotValidException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ValidationError err =new ValidationError(Instant.now(),status.value(),"Dados invalidos",request.getRequestURI());
        for(FieldError f: e.getBindingResult().getFieldErrors()){
            err.addError(f.getField(),f.getDefaultMessage());
        }
        return ResponseEntity.status(status).body(err);
    }
}
