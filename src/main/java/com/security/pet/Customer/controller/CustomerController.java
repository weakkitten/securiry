package com.security.pet.Customer.controller;

import com.security.pet.Customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;
}
