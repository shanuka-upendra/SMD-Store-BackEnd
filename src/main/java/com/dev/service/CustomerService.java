package com.dev.service;

import com.dev.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getAllCustomers();
    boolean addCustomer(CustomerDto customerDto);
    boolean updateCustomer(CustomerDto customerDto);
    CustomerDto searchCustomer(String id);
    boolean deleteCustomer(String id);
}
