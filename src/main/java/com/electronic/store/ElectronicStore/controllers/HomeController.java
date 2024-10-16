package com.electronic.store.ElectronicStore.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping
    public String  testing(){
        logger.info("Received a request for the testing endpoint.");
        return "welcome to my store";
    }
}