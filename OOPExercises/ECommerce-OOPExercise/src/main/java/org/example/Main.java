package org.example;


import org.example.business.Manager;
import org.example.entities.Customer;
import org.example.entities.Order;

public class Main {
    public static void main(String[] args) {

        Manager manager=new Manager();

        manager.addOrder(new Order(1,"Telefon","Apple","13.11.2022"));
        manager.addOrder(new Order(2,"Televizyon","Vestel","12.12.2022"));
        manager.addOrder(new Order(3,"Buzdolabı","Arçelik","11.10.2022"));

        manager.addCustomer(new Customer(1,"Ali","Kemal","Ankara"));
        manager.addCustomer(new Customer(2,"Mehmet","Fırın","İstanbul"));
        manager.addCustomer(new Customer(3,"Canan","Can","İzmir"));

        System.out.println("------------------------------------------");
        manager.listOrders();
        System.out.println("------------------------------------------");
        manager.deleteOrders(2);
        System.out.println("------------------------------------------");
        manager.listOrders();
        System.out.println("------------------------------------------");
        manager.updateOrders(1,"11.11.2022");
        manager.listOrders();
    }
}