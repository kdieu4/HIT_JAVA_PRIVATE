package org.example.dto;

import org.example.model.Product;

public class ProductDTO extends Product {
    private String categoryName;

    public ProductDTO(){}

    public ProductDTO(String categoryName) {
        this.categoryName = categoryName;
    }

    public ProductDTO(String id, String name, double price, String categoryId, String categoryName) {
        super(id, name, price, categoryId);
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Product: " + getName() + " | Price: " + getPrice() + " | Category: " + categoryName;
    }
}
