package com.testproject.testmybatisplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Health Controller
 *
 * @author liudi
 * @since 2022.05.02
 */
@RestController
@RequestMapping("/api/health")
public class HealthController {

    /**
     * Application Health Check Interface
     * @return
     */
    @GetMapping()
    public String index() {
        return "success";
    }
}
