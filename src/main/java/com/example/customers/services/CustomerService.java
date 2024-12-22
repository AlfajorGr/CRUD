package com.example.customers.services;

import com.example.customers.entities.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomer(Integer id);

    List<Customer> getAllCustomers();

    void addACustomer(Customer customer);

    void removeCustomer(Integer id);

    void updateCustomer(Integer id, Customer updateCustomer);

    List<Customer> searchCustomer(String email, String address);
}
