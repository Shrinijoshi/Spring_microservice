package com.joshi.Spring_microservice.customer.services;

import com.joshi.Spring_microservice.customer.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
