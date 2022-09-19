package com.example.demotest;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemotestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemotestApplication.class, args);
    }

}
