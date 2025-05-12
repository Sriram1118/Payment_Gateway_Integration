package com.example.PayementGateway.Controller;

import com.example.PayementGateway.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create-order")
    public String createOrder(@RequestParam int amount, @RequestParam String currency){
        try{
            return paymentService.createOrder(amount,currency,"recepient_100");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}