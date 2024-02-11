package com.bbps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableKafka
@EnableJpaRepositories
@EnableScheduling
@SpringBootApplication
public class BillerApp {
    public static void main(String[] args) {
        SpringApplication.run(BillerApp.class, args);
    }
}