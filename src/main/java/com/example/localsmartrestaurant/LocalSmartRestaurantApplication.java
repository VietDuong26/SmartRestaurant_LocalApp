package com.example.localsmartrestaurant;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class LocalSmartRestaurantApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(LocalSmartRestaurantApplication.class, args);
    }

}
