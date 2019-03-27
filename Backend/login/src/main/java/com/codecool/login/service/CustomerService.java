package com.codecool.login.service;

import com.codecool.login.entity.Customer;
import com.codecool.login.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer getOneCustomer(long id) {
        return customerRepository.getOne(id);
    }
}
