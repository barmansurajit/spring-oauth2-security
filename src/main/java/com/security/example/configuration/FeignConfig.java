package com.security.example.configuration;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

@Configuration
public class FeignConfig {

    private OAuth2RestTemplate oAuth2RestTemplate(OAuth2ProtectedResourceDetails oAuth2ProtectedResourceDetails){
        return new OAuth2RestTemplate(oAuth2ProtectedResourceDetails);
    }

    @Bean
    public RequestInterceptor requestInterceptor(OAuth2ProtectedResourceDetails oAuth2ProtectedResourceDetails){
        return requestTemplate -> requestTemplate.header("Authorization", "Bearer "+this.oAuth2RestTemplate(oAuth2ProtectedResourceDetails).getAccessToken());
    }
}
