package com.example.vehicleservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.vehicleservice.model.Customer;
import com.example.vehicleservice.repository.CustomerRepository;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Register customer
    public Customer register(Customer customer) {
        return customerRepository.save(customer);
    }

    // Login customer
    public Optional<Customer> login(String email, String password) {
        Optional<Customer> customer = customerRepository.findByEmail(email);

        if (customer.isPresent() && customer.get().getPassword().equals(password)) {
            return customer;
        }

        return Optional.empty();
    }
}