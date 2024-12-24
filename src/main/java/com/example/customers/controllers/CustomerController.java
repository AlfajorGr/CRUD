package com.example.customers.controllers;

import com.example.customers.entities.Customer;
import com.example.customers.services.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") //
public class CustomerController {

    @Autowired
    private CustomerServiceImp service;

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Integer id){
        return service.getCustomer(id);
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        return service.getAllCustomers();
    }

    @PostMapping("/customer")
    public void addACustomer(@RequestBody Customer customer){
        service.addACustomer(customer);
    }

    @DeleteMapping("/customer/{id}")
    public void removeCustomer(@PathVariable Integer id){
        service.removeCustomer(id);
    }

    @PutMapping("/customer/{id}")
    public void updateCustomer(@PathVariable Integer id,
                               @RequestBody Customer updateCustomer){
        service.updateCustomer(id, updateCustomer);
    }

    @GetMapping("/customer/search")
    public List<Customer> searchCustomer(@RequestParam(name = "email", required = false) String email,
                                         @RequestParam(name = "address", required = false) String address){
        return service.searchCustomer(email, address);
    }
}
