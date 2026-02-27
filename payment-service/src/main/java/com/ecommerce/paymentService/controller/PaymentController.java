package com.ecommerce.paymentService.controller;

import com.ecommerce.paymentService.model.Payment;
import com.ecommerce.paymentService.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/process")
    public ResponseEntity<Payment> processPayment(
            Authentication authentication,
            @RequestBody Map<String, Object> request) {
        String username = authentication.getName();
        Long orderId = Long.valueOf(request.get("orderId").toString());
        Double amount = Double.valueOf(request.get("amount").toString());
        Payment payment = paymentService.processPayment(orderId, username, amount);
        return ResponseEntity.ok(payment);
    }

    @GetMapping("/my-payments")
    public ResponseEntity<List<Payment>> getMyPayments(Authentication authentication) {
        return ResponseEntity.ok(paymentService.getPaymentsByUsername(authentication.getName()));
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<List<Payment>> getPaymentsByOrder(@PathVariable Long orderId) {
        return ResponseEntity.ok(paymentService.getPaymentsByOrderId(orderId));
    }
}