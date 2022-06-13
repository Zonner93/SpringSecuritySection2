package com.zonner93.SpringSecuritySection2.service;

import com.zonner93.SpringSecuritySection2.entity.Customer;
import com.zonner93.SpringSecuritySection2.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
