package org.example.entities;

public class Customer {

    private int customerId;
    private String customerName;
    private String customerLastName;


    public Customer(int customerId, String customerName, String customerLastName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }
}
