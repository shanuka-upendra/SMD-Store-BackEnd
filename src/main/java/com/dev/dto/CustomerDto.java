package com.dev.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {
    private String id;
    private String title;
    private String name;
    private Date dob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;
}
