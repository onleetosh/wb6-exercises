package com.onleetosh.pluralsight;

public class LineItem {
    private int productId;
    private String productName;
    private double price;
    private int quantity;



 //constructor getters and setters


    public LineItem(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getLineTotal(){
        return quantity * price;
    }
}