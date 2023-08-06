package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.models")
public class BookMyShow {
    public static void main(String[] args) {
        SpringApplication.run(BookMyShow.class, args);
        System.out.print("wertyui");
    }
}
