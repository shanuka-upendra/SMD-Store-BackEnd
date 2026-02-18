package com.dev.Controller;

import com.dev.dto.CustomerDto;
import com.dev.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
@Tag(name = "Customer-Controller" , description = "Customer API Collection")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/search-all")
    public List<CustomerDto> getAllCustomer(){
        return customerService.getAllCustomers();
    }
}
