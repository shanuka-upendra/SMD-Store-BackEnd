package com.dev.repository;

import com.dev.dto.CustomerDto;

import java.util.List;

public interface CustomerRepository {
    List<CustomerDto> getAllCustomer();
    boolean addCustomer(CustomerDto customerDto);
    boolean updateCustomer(CustomerDto customerDto);
    boolean deleteCustomer(String id);
    CustomerDto searchCustomerById(String id);
}
