package com.song.config.profile.test.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class DevConfig {

    @Bean
    public String hello() {
        return "Dev Hello";
    }
}
