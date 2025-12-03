package com.shoppingcart.shoppingcart.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long id;

    @Column(name = "PRODUCT_NAME", nullable = false)
    private String name;

    @Column(name = "PRODUCT_PRICE", nullable = false)
    private Double price;

    @Column(name = "PRODUCT_AVLBLTY", nullable = false)
    private Boolean inStock;

    @Column(name = "PRODUCT_DATA_URL", nullable = false)
    private String image;

    public Products() {}

    public Products(Long id, String name, Double price, Boolean inStock, String image) {
        this.id = id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}