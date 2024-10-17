package com.example.productcatalog.ProductEntity;



import java.util.UUID;

public class ProductEntity {
    private final UUID id;
    private String name;
    private String category;
    private double price;
    private int stock;

    // Constructor
    public ProductEntity(String name, String category, double price, int stock) {
        this.id = UUID.randomUUID(); // Genera un UUID único automáticamente
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters y Setters
    public UUID getId() {
        return id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
