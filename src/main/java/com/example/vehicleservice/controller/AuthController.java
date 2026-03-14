package com.example.vehicleservice.controller;

import org.springframework.web.bind.annotation.*;
import com.example.vehicleservice.model.Customer;
import com.example.vehicleservice.service.CustomerService;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AuthController {
    private final CustomerService customerService;
    public AuthController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public Customer register(@RequestBody Customer customer) {
        return customerService.register(customer);
    }

    @PostMapping("/login")
    public Optional<Customer> login(@RequestBody Customer customer) {
        return customerService.login(customer.getEmail(), customer.getPassword());
    }
}