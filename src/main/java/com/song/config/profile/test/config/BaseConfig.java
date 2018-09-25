package com.song.config.profile.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("base")
@Configuration
public class BaseConfig {

    @Bean
    public String hello() {
        return "Base Hello";
    }
}
