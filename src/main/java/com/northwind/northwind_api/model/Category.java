package com.northwind.northwind_api.model;

import jakarta.persistence.*;

@Entity
@Table (name = "Categories")
public class Category {

    @Column (name = "CategoryName")
    private String categoryName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "CategoryId")
    private Integer categoryId;

    @Column (name = "Description")
    private String categoryDescription;


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
