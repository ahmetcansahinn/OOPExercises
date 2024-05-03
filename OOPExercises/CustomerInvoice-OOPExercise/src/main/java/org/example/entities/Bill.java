package org.example.entities;

public class Bill {
    private int billId;
    private int price;
    private String month;

    public Bill() {
    }

    public Bill(int billId, int price, String month) {
        this.billId = billId;
        this.price = price;
        this.month = month;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
