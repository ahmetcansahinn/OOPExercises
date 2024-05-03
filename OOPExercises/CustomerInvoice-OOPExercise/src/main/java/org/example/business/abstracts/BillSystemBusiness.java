package org.example.business.abstracts;

import org.example.entities.Bill;
import org.example.entities.Customer;

import java.util.List;

public interface BillSystemBusiness {
    void addCustomer(Customer customer);

    public List<Customer> filterCustomers();

    void addBill(Bill bill);

    public List<Bill> filterBill();

    public List<Bill> filterBillMoreThan1500();

    public List<Bill> filterBillLessThan500();

    public List<Bill> filterBillAddedJune();

    public List<Customer> filterCustomersContainsC();

//    int filterAverageBillMoreThan1500();





}
