package com.dev.service.impl;

import com.dev.dto.CustomerDto;
import com.dev.repository.CustomerRepository;
import com.dev.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.getAllCustomer();
    }

    @Override
    public boolean addCustomer(CustomerDto customerDto) {
        return customerRepository.addCustomer(customerDto);
    }

    @Override
    public boolean updateCustomer(CustomerDto customerDto) {
        return customerRepository.updateCustomer(customerDto);
    }

    @Override
    public CustomerDto searchCustomer(String id) {
        return customerRepository.searchCustomerById(id);
    }
}
