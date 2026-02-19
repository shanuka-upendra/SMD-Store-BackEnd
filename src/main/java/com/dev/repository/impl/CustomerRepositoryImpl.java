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
            customerDto.setDob(rs.getDate(4).toLocalDate());
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
        String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getPostalCode()) > 0;
    }

    @Override
    public boolean updateCustomer(CustomerDto customerDto) {
        String sql = "UPDATE customer SET CustTitle = ? , CustName = ? , DOB = ? , salary = ? , CustAddress = ? , City = ? , Province = ? , PostalCode = ? WHERE CustID = ?";
        return jdbcTemplate.update(sql,
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getPostalCode(),
                customerDto.getId()) > 0;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public CustomerDto searchCustomerById(String id) {
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            CustomerDto customerDto = new CustomerDto();
            customerDto.setId(rs.getString(1));
            customerDto.setTitle(rs.getString(2));
            customerDto.setName(rs.getString(3));
            customerDto.setDob(rs.getDate(4).toLocalDate());
            customerDto.setSalary(rs.getDouble(5));
            customerDto.setAddress(rs.getString(6));
            customerDto.setCity(rs.getString(7));
            customerDto.setProvince(rs.getString(8));
            customerDto.setPostalCode(rs.getString(9));
            return customerDto;
        },id);
    }
}
