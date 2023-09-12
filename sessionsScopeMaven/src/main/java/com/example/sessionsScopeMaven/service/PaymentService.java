package com.example.sessionsScopeMaven.service;

import com.example.sessionsScopeMaven.NotEnoughMoneyException;
import com.example.sessionsScopeMaven.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
