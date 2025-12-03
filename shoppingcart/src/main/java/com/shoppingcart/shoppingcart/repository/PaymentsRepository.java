package com.shoppingcart.shoppingcart.repository;

import com.shoppingcart.shoppingcart.model.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepository extends JpaRepository<Payments, Long> {
}
