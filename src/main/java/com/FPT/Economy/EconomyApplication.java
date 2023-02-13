package com.FPT.Economy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class EconomyApplication {
    private static final Logger logger = LogManager.getLogger(EconomyApplication.class);

    public static void main(String[] args) {
        logger.error("Application started.");
        SpringApplication.run(EconomyApplication.class, args);
    }

}
