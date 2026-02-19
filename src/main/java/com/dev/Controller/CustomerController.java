package com.dev.Controller;

import com.dev.dto.CustomerDto;
import com.dev.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
@CrossOrigin
@Tag(name = "Customer-Controller" , description = "Customer API Collection")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/search-all")
    public List<CustomerDto> getAllCustomer(){
        return customerService.getAllCustomers();
    }

    @PostMapping("/add-customer")
    public boolean addCustomer(@RequestBody CustomerDto customerDto){
        return customerService.addCustomer(customerDto);
    }

    @PutMapping("/update-customer")
    public boolean updateCustomer(@RequestBody CustomerDto customerDto){
        return customerService.updateCustomer(customerDto);
    }

    @GetMapping("/search-customer/{id}")
    public CustomerDto searchCustomer(@PathVariable String id){
        return customerService.searchCustomer(id);
    }


}
