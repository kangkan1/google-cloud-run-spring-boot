package com.cloudrun.microservicetemplate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/munu")
public class Munu {

    @GetMapping("/punu")
    public String getUsers() {
        return "punu";
    }
}
