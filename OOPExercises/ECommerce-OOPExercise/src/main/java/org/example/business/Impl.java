package org.example.business;

import org.example.entities.Customer;
import org.example.entities.Order;

import java.util.List;

public interface Impl {
    void addOrder(Order order);
    void addCustomer(Customer customer);
    List<Order> listOrders();
    void deleteOrders(int orderId);

    void updateOrders(int orderId,String orderDate);

    }
