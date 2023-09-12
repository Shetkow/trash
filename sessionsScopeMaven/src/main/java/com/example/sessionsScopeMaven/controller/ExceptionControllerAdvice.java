package com.example.sessionsScopeMaven.controller;

import com.example.sessionsScopeMaven.ErroDetails;
import com.example.sessionsScopeMaven.NotEnoughMoneyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErroDetails> exeptionNotEnouhMoney(){
        ErroDetails erroDetails = new ErroDetails();
        erroDetails.setErrorMessage("Not enough Money");
        return ResponseEntity.badRequest()
                .body(erroDetails);
    }
}
