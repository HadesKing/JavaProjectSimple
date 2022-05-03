package com.testproject.testmybatis2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public final class HealthController {

    @GetMapping()
    public String index(){
        return "success";
    }

}
