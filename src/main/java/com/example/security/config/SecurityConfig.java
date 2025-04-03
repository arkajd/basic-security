package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth.requestMatchers("/api/public").permitAll()  // anyone can access this API
        .anyRequest().authenticated())                                                        // everything else requires login
                .formLogin(Customizer.withDefaults())                                         // enables default login page
                .logout(Customizer.withDefaults());                                           // enable logout functionality
        return http.build();
    }
}
