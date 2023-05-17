package com.oauth2.springoauth.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class OauthConfiguration {

    @Bean
    @Order(1)
    public SecurityFilterChain configureOauthSecurity (HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET, "/")
                .permitAll()
                .requestMatchers(HttpMethod.GET, "/secured")
                .authenticated().and()
                .oauth2Login(Customizer.withDefaults())
                .build();
    }
}
