package com.july74;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjiao
 * @since 1.0
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String hello() {
        return "helloWorld";

    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
