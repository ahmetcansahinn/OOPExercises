package org.example.business.concrets;

import org.example.business.abstracts.BillSystemBusiness;
import org.example.databases.abstracts.BillSystemDao;
import org.example.entities.Bill;
import org.example.entities.Customer;

import java.util.List;

public class BillSystemBusinessImp implements BillSystemBusiness {
    private BillSystemDao billSystemDao;

    public BillSystemBusinessImp(BillSystemDao billSystemDao) {
        this.billSystemDao = billSystemDao;
    }

    @Override
    public void addCustomer(Customer customer) {
        billSystemDao.addCustomer(customer);
    }

    @Override
    public List<Customer> filterCustomers() {
        System.out.println("Müşterilerin listesi:");
        billSystemDao.filterCustomers();
        return billSystemDao.filterCustomers();
    }

    @Override
    public void addBill(Bill bill) {
        billSystemDao.addBill(bill);
    }

    @Override
    public List<Bill> filterBill() {
        System.out.println("Faturaların listesi:");
        billSystemDao.filterBill();
        return billSystemDao.filterBill();
    }

    @Override
    public List<Bill> filterBillMoreThan1500() {
        System.out.println("Fatura fiyatı 1500'den fazla olan fatura listesi:");
        billSystemDao.filterBillMoreThan1500();
        return billSystemDao.filterBillMoreThan1500();
    }

    @Override
    public List<Bill> filterBillLessThan500() {
        System.out.println("Fatura fiyatı 500'den az olan faturaların listesi:");
        billSystemDao.filterBillLessThan500();
        return billSystemDao.filterBillLessThan500();
    }

    @Override
    public List<Bill> filterBillAddedJune() {
        System.out.println("Haziran ayında eklenen faturalar :");
        billSystemDao.filterBillAddedJune();
        return billSystemDao.filterBillAddedJune();
    }

    @Override
    public List<Customer> filterCustomersContainsC() {
        System.out.println("İçerisinde c harfi olan müşteri listesi:");
        billSystemDao.filterCustomersContainsC();
        return billSystemDao.filterCustomersContainsC();
    }

}
