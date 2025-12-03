package com.shoppingcart.shoppingcart.model;


import jakarta.persistence.*;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ITEM_NAME")
    private String name;

    @Column(name = "ITEM_PRICE")
    private double price;

    @Column(name = "ITEM_AVLBLTY")
    private boolean inStock = true;

    @Column(name = "IMAGE_DATA")
    private String image;


    public Product() {} // Required by JPA

    public Product(String name, double price, boolean inStock, String image) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getImage()  {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
