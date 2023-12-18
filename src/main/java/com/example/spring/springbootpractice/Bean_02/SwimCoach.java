package com.example.spring.springbootpractice.Bean_02;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Swim 100m daily";
    }
}
