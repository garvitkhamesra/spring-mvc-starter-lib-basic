package com.labrats.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class Spring5WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5WebApplication.class, args);
    }

}
