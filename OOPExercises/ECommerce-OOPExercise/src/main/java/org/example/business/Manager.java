package org.example.business;

import org.example.business.Impl;
import org.example.entities.Customer;
import org.example.entities.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager implements Impl {
    List<Order> orders;
    List<Customer> customers;

    public Manager() {
        this.orders=new ArrayList<>();
        this.customers=new ArrayList<>();
    }

    public Manager(List<Order> orders, List<Customer> customers) {
        this.orders = orders;
        this.customers = customers;
    }


    @Override
    public void addOrder(Order order) {
        orders.add(order);

    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);

    }

    @Override
    public List<Order> listOrders() {
        orders.stream()
                .forEach(order -> {
                    System.out.println("Siparişler listelendi: "+ order.getOrderId()+ " numaralı id "
                    +order.getOrderName()+" isme sahip olan sipariş " + order.getOrderDate() +
                            " tarihinde sipariş edildi");
                });
        return orders;
    }

    @Override
    public void deleteOrders(int orderId) {
        List<Order> updatedOrders= orders.stream()
                .filter(order -> order.getOrderId()!=orderId)
                .collect(Collectors.toList());

        if(updatedOrders.size()<orders.size()){
            orders=updatedOrders;
            System.out.println("Sipariş silindi: "+ orderId);
        }else{
            System.out.println("Belirtilen sipariş bulunamadı.");
        }
    }

    @Override
    public void updateOrders(int orderId, String orderDate) {
        orders.stream()
                .filter(order -> order.getOrderId() == orderId)
                .map(order -> {

                    order.setOrderDate(orderDate);
                    return order;
                })
                .collect(Collectors.toList());
    }

    }



