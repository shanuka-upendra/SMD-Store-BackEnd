package com.dev.controller.orderDetails;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order-details")
@CrossOrigin
@Tag(name = "Order-Details-Controller" , description = "Order Details API Collection")
public class OrderDetailsController {

}
