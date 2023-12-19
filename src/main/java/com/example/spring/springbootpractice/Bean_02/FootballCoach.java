package com.example.spring.springbootpractice.Bean_02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// 2.6 used when more than 1 bean
//@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class FootballCoach implements Coach{
    public FootballCoach(){
        System.out.println("football coach");
    }
    @Override
    public String getDailyWorkout(){
        return "Free kick practice";
    }
    //  2.7  @PreDestroy
//    @PostConstruct
}
