package com.shoppingcart.shoppingcart.repository;

import com.shoppingcart.shoppingcart.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}

