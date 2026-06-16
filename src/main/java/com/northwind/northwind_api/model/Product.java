package com.northwind.northwind_api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Product {

    private int Id;
    private String name;
    private String category;
    private BigDecimal price;

    public Product() {};
    public Product(int id, String name, String category, BigDecimal price) {
        this.Id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
