package com.example.payments2.controller;

import com.example.payments2.model.Payment;
import com.example.payments2.proxy.PaymentsProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {

    private final PaymentsProxy proxy;

    public PaymentsController(PaymentsProxy proxy) {
        this.proxy = proxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ){
        String requestId = UUID.randomUUID().toString();

        return proxy.createPayment(requestId,payment);
    }
}
