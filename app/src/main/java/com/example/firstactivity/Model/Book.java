package com.example.firstactivity.Model;

public class Book {
    private String id;
    private double price;
    private String name;
    private int quantity;
    private String author;

    public Book(String id, double price, String name, int quantity, String author) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
