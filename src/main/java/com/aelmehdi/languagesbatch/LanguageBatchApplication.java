package com.aelmehdi.languagesbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LanguageBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LanguageBatchApplication.class);
    }
}
