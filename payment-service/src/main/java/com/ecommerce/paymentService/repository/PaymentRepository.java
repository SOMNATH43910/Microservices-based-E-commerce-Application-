package com.ecommerce.paymentService.repository;

import com.ecommerce.paymentService.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByUsername(String username);
    List<Payment> findByOrderId(Long orderId);
}