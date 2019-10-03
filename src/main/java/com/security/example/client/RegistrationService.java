package com.security.example.client;

import com.security.example.model.Registration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "registration", url = "https://registration-pal-hibiscus.cfapps.io")
public interface RegistrationService {

    @GetMapping("/users/112")
    Registration getRegistration();
}
