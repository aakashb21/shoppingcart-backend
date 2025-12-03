package com.shoppingcart.shoppingcart.model;


import jakarta.persistence.*;
@Entity
@Table(name = "users")
public class Users {

    @Id
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "USER_NAME")
    private String userName;
    @Column (name = "USER_EMAIL")
    private String userEmail;
    @Column(name = "USER_PASSWORD")
    private String userPassword;
    @Column(name = "USER_ADDR")
    private String userAddr;
    @Column (name = "USER_CONTACT")
    private String userContact;
    @Column(name = "PAYMENT_MODE")
    private String userModePayment;

    public Users(){ }

    public Users(Long userId, String userName, String userEmail, String userPassword, String userAddr, String userContact, String userModePayment) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userAddr = userAddr;
        this.userContact = userContact;
        this.userModePayment = userModePayment;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserContaact() {
        return userContact;
    }

    public void setUserContaact(String userContaact) {
        this.userContact = userContaact;
    }

    public String getUserModePayment() {
        return userModePayment;
    }

    public void setUserModePayment(String userModePayment) {
        this.userModePayment = userModePayment;
    }
}
