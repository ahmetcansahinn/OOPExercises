package org.example.entities;

public class Order {
    private int orderId;
    private String orderName;
    private String brand;
    private String orderDate;

    public Order() {
    }

    public Order(int orderId, String orderName, String brand, String orderDate) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.brand = brand;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
