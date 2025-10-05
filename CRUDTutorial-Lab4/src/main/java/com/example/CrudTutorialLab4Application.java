package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class CrudTutorialLab4Application {

    public static void main(String[] args) {
        SpringApplication.run(CrudTutorialLab4Application.class, args);
    }
}
