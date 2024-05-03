package org.example;


import org.example.business.abstracts.BillSystemBusiness;
import org.example.business.concrets.BillSystemBusinessImp;
import org.example.databases.concrets.BillSystemDaoImp;
import org.example.entities.Bill;
import org.example.entities.Customer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BillSystemBusinessImp billSystemBusinessImp=new BillSystemBusinessImp(new BillSystemDaoImp());
        billSystemBusinessImp.addCustomer(new Customer(1,"Ali","Can"));
        billSystemBusinessImp.addCustomer(new Customer(2,"Aslı","Dilek"));
        billSystemBusinessImp.addCustomer(new Customer(3,"Mehmet","Melek"));
        billSystemBusinessImp.addCustomer(new Customer(4,"Cemal","Can"));
        billSystemBusinessImp.addCustomer(new Customer(5,"Ayşe","Canan"));

        billSystemBusinessImp.addBill(new Bill(1,30000,"Haziran"));
        billSystemBusinessImp.addBill(new Bill(2,40000,"Haziran"));
        billSystemBusinessImp.addBill(new Bill(3,50000,"Temmuz"));
        billSystemBusinessImp.addBill(new Bill(4,1000,"Ağustos"));
        billSystemBusinessImp.addBill(new Bill(5,30000,"Eylül"));
        billSystemBusinessImp.addBill(new Bill(6,200,"Temmuz"));


        List<Customer> filteredCustomers = billSystemBusinessImp.filterCustomers();

        filteredCustomers.forEach(customer ->
                System.out.println("Müşteri ID: " + customer.getCustomerId() + ", Müşteri ismi: " + customer.getCustomerName()));

        List<Bill> filteredBills=billSystemBusinessImp.filterBill();
        filteredBills.forEach(bill ->
                System.out.println("Fatura ID: " + bill.getBillId() + ", Fatura Fiyatı: " + bill.getPrice()));


        List<Bill> filteredBillss=billSystemBusinessImp.filterBillMoreThan1500();
        filteredBillss.forEach(bill ->
                System.out.println("Fatura ID: " + bill.getBillId() + ", Fatura Fiyatı: " + bill.getPrice()));

        List<Bill> filteredBills500=billSystemBusinessImp.filterBillLessThan500();
        filteredBills500.forEach(bill ->
                System.out.println("Fatura ID: " + bill.getBillId() + ", Fatura Fiyatı: " + bill.getPrice()));

        List<Bill> filteredBillsAddedByJune=billSystemBusinessImp.filterBillAddedJune();
        filteredBillsAddedByJune.forEach(bill ->
                System.out.println("Fatura ID: " + bill.getBillId() + ", Fatura Fiyatı: " + bill.getPrice()));

        List<Customer> filteredCustomersContainsC = billSystemBusinessImp.filterCustomersContainsC();
        filteredCustomersContainsC.forEach(customer ->
                System.out.println("Müşteri ID: " + customer.getCustomerId() + ", Müşteri ismi: " + customer.getCustomerName()));

//        billSystemBusinessImp.filterAverageBillMoreThan1500();

    }
}