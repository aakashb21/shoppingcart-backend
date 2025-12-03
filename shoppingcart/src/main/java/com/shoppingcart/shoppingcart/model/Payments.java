package com.shoppingcart.shoppingcart.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order;

    @Column(name = "payment_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime paymentDate;

    @Column(name = "payment_amount", nullable = false)
    private BigDecimal paymentAmount;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "payment_mode")
    private String paymentMode;

    public Payments() {}

    public Payments(Long paymentId, Orders order, LocalDateTime paymentDate, BigDecimal paymentAmount, String paymentStatus, String paymentMode) {
        this.paymentId = paymentId;
        this.order = order;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = paymentStatus;
        this.paymentMode = paymentMode;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}