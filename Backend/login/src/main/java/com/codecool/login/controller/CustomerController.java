package com.codecool.login.controller;

import com.codecool.login.entity.Customer;
import com.codecool.login.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping
    public void saveCustomersData(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
        Customer customer = Customer.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();

        customerRepository.save(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
}
