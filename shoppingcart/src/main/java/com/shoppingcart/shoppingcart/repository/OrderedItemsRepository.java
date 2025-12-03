package com.shoppingcart.shoppingcart.repository;

import com.shoppingcart.shoppingcart.model.OrderedItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedItemsRepository extends JpaRepository<OrderedItems, Long> {
}
