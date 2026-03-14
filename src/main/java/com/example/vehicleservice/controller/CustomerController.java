 package com.example.vehicleservice.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.example.vehicleservice.model.Customer;
import com.example.vehicleservice.service.CustomerService;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "https://vehicle-service-frontend.onrender.com")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Register API
    @PostMapping("/register")
    public Customer register(@RequestBody Customer customer) {
        return customerService.register(customer);
    }

    // Login API
    @PostMapping("/login")
    public Optional<Customer> login(@RequestParam String email, @RequestParam String password) {
        return customerService.login(email, password);
    }
}