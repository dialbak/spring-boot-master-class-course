package com.example.demo.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    // public CustomerService(@Qualifier("fake") CustomerRepo customerRepo) {
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
}
