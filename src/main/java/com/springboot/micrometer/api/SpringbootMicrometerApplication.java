package com.springboot.micrometer.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class SpringbootMicrometerApplication {

    @GetMapping("/message")
    public String getMessage() {
        return "Working....";
    }

    @RequestMapping(value = "/exception")
    public String exception() {

        try {
            throw new Exception("An error occurred...");
        } catch (Exception e) {
            log.error(e.toString());
            return e.toString();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMicrometerApplication.class, args);
    }

}
