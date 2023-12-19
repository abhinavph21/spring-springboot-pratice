package com.example.spring.springbootpractice.Bean_02;

import org.springframework.stereotype.Component;

// 2.1 component for bean
@Component
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("cricket coach");
    }
    @Override
    public String getDailyWorkout(){
        return "cricket net practice";
    }
}
