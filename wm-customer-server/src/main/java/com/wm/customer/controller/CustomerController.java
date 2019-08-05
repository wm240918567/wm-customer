package com.wm.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/get1")
    public String get1(){
        return "ccccccccc";
    }

}
