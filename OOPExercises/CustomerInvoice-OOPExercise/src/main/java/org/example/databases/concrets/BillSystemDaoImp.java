package org.example.databases.concrets;

import org.example.databases.abstracts.BillSystemDao;
import org.example.entities.Bill;
import org.example.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BillSystemDaoImp implements BillSystemDao {

    private List<Customer> customers;
    private List<Bill> bills;

    public BillSystemDaoImp() {
        this.customers = new ArrayList<>();
        this.bills=new ArrayList<>();
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> filterCustomers() {
        return customers.stream()
                .map(customer -> new Customer(customer.getCustomerId(), customer.getCustomerName(),customer.getCustomerLastName()))
                .toList();
    }

    @Override
    public void addBill(Bill bill) {
        bills.add(bill);

    }

    @Override
    public List<Bill> filterBill() {
        return bills.stream()
                .map(bill -> new Bill(bill.getBillId(), bill.getPrice(),bill.getMonth()))
                .toList();
    }

    @Override
    public List<Bill> filterBillMoreThan1500() {
            return bills.stream()
                    .filter(bill -> bill.getPrice() > 1500)
                    .map(bill -> new Bill(bill.getBillId(), bill.getPrice(),bill.getMonth()))
                    .toList();
        }

    @Override
    public List<Bill> filterBillLessThan500() {
        return bills.stream()
                .filter(bill -> bill.getPrice() < 500)
                .map(bill -> new Bill(bill.getBillId(), bill.getPrice(),bill.getMonth()))
                .toList();
    }

    @Override
    public List<Bill> filterBillAddedJune() {
        return bills.stream()
                .filter(bill -> bill.getMonth().equals("Haziran"))
                .map(bill -> new Bill(bill.getBillId(), bill.getPrice(),bill.getMonth()))
                .toList();
    }

    @Override
    public List<Customer> filterCustomersContainsC() {
        return customers.stream()
                .filter(customer -> customer.getCustomerName().contains("c") || customer.getCustomerName().contains("C"))
                .collect(Collectors.toList());
    }

//    @Override
//    public List<Bill> filterAverageBillMoreThan1500() {
//        List<Integer> expensiveBillPrices = bills.stream()
//                .filter(bill -> bill.getPrice() > 1500)
//                .map(Bill::getPrice)
//                .collect(Collectors.toList());
//
//        return expensiveBillPrices;
//    }


    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
