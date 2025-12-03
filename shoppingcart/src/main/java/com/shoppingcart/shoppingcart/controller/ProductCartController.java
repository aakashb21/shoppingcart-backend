package com.shoppingcart.shoppingcart.controller;


import com.shoppingcart.shoppingcart.model.OrderedItems;
import com.shoppingcart.shoppingcart.model.Orders;
import com.shoppingcart.shoppingcart.model.Payments;
import com.shoppingcart.shoppingcart.repository.OrderRepository;
import com.shoppingcart.shoppingcart.repository.OrderedItemsRepository;
import com.shoppingcart.shoppingcart.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductCartController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderedItemsRepository orderedItemsRepository;

    @Autowired
    private PaymentsRepository paymentsRepository;


    @PostMapping("/order/create")
    public ResponseEntity<?> createOrder(@RequestBody Orders order) {
        try {
            Orders savedOrder = orderRepository.save(order);
            return ResponseEntity.ok().body("Order created successfully with ID: " + savedOrder.getOrderId());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error creating order: " + e.getMessage());
        }
    }

    @PostMapping("/ordereditems/create")
    public ResponseEntity<?> createOrderedItems(@RequestBody OrderedItems orderedItems) {
        try {
            OrderedItems savedOrderedItems = orderedItemsRepository.save(orderedItems);
            return ResponseEntity.ok().body("OrderedItem entry created successfully for ID: " + savedOrderedItems.getOrder());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error creating ordered items: " + e.getMessage());
        }
    }

    @PostMapping("/payments/create")
    public ResponseEntity<?> createPayments(@RequestBody Payments payments) {
        try {
            Payments savePayments = paymentsRepository.save(payments);
            return ResponseEntity.ok().body("Order created successfully with ID: " + savePayments.getPaymentId());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error creating order: " + e.getMessage());
        }
    }

}
