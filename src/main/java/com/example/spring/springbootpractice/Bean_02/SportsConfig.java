package com.example.spring.springbootpractice.Bean_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 2.8 using @bean, used where third party classes used.  @component can't be used
@Configuration
public class SportsConfig {
    @Bean
    public Coach getSwimCoach(){
        return new SwimCoach();
    }
}
