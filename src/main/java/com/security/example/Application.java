package com.security.example;

import com.security.example.client.RegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;


@Slf4j
@SpringBootApplication
@EnableFeignClients
@EnableOAuth2Client
public class Application implements CommandLineRunner {

    private RegistrationService registrationService;

    public Application(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("********* {}", registrationService.getRegistration());
    }
}
