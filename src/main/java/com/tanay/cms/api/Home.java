package com.tanay.cms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {

    // 1st

    @GetMapping
    public String home(){  
        return "Application is working .. "+new Date();
    }
}
