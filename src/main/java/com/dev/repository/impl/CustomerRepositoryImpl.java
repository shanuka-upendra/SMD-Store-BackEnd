package com.dev.repository.impl;

import com.dev.dto.CustomerDto;
import com.dev.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<CustomerDto> getAllCustomer() {
        String sql = "SELECT * FROM customer";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            CustomerDto customerDto = new CustomerDto();
            customerDto.setId(rs.getString(1));
            customerDto.setTitle(rs.getString(2));
            customerDto.setName(rs.getString(3));
            customerDto.setDob(rs.getDate(4));
            customerDto.setSalary(rs.getDouble(5));
            customerDto.setAddress(rs.getString(6));
            customerDto.setCity(rs.getString(7));
            customerDto.setProvince(rs.getString(8));
            customerDto.setPostalCode(rs.getString(9));
            return customerDto;
        });
    }

    @Override
    public boolean addCustomer(CustomerDto customerDto) {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDto customerDto) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public CustomerDto searchCustomerById(String id) {
        return null;
    }
}
