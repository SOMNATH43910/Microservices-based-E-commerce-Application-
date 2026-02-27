package com.ecommerce.paymentService.service;

import com.ecommerce.paymentService.model.Payment;
import com.ecommerce.paymentService.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public Payment processPayment(Long orderId, String username, Double amount) {
        Payment payment = new Payment();
        payment.setOrderId(orderId);
        payment.setUsername(username);
        payment.setAmount(amount);

        // Stripe Mock — randomly success ya failure
        boolean isSuccess = Math.random() > 0.2;

        if (isSuccess) {
            payment.setStatus("SUCCESS");
            payment.setTransactionId("TXN-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase());
        } else {
            payment.setStatus("FAILED");
            payment.setTransactionId(null);
        }

        return paymentRepository.save(payment);
    }

    public List<Payment> getPaymentsByUsername(String username) {
        return paymentRepository.findByUsername(username);
    }

    public List<Payment> getPaymentsByOrderId(Long orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
}