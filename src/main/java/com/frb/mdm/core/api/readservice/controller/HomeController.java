package com.frb.mdm.core.api.readservice.controller;

import com.frb.mdm.core.api.readservice.Model.Customer;
import com.frb.mdm.core.api.readservice.config.GlobalProperties;
import com.frb.mdm.core.api.readservice.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    CustomerRepository repository;

    @Autowired
    private GlobalProperties globalProperties;
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping(value = "/")
    public String Home() {
        return "API working!";
    }


    @GetMapping(value = "/getValues", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getv() {
        List<Customer> all = repository.findAll();
        return all;
    }

    @GetMapping(value = "/welcome")
    public String welcome() { return "welcome working!"; }
    @RequestMapping("/swagger")
    public String greeting() {
        return "redirect:/swagger-ui.html";
    }

    @GetMapping("/log")
    public String log() {

        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        logger.error("error occurred", data);
        logger.debug("debug occurred", data);
        logger.warn("warn occurred", data);
        logger.info("warn occurred", data);
        return "log written";
    }

    @GetMapping("/read-config")
    public String readGlobalConfig() {
        return globalProperties.getMessage();
    }


}
