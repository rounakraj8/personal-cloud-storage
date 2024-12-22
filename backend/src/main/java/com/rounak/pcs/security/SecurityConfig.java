package com.rounak.pcs.security;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Value("${security.skip-urls}")
  private List<String> skipUrls;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(authorizeRequests -> {
          skipUrls.forEach(url -> authorizeRequests.requestMatchers(url).permitAll());
          authorizeRequests.anyRequest().authenticated();
        })
        .csrf(csrf -> csrf.disable());  // Disable CSRF for testing purposes, if needed

    return http.build();
  }
}
