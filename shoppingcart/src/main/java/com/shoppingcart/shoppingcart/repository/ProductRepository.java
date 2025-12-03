package com.shoppingcart.shoppingcart.repository;

import com.shoppingcart.shoppingcart.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
