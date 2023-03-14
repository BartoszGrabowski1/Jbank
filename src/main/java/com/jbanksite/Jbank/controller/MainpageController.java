package com.jbanksite.Jbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainpageController {

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }
}
