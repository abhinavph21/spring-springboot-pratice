package com.example.spring.springbootpractice.Bean_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInjection {
//  2.3 field injection
//    @Autowired
    private final Coach myCoach;

//  2.2  constructor injection
    @Autowired
//    2.4 qualifier ,  first letter small
    public DependencyInjection(@Qualifier("getSwimCoach") Coach firstCoach, @Qualifier("footballCoach") Coach secondCoach){
        myCoach=firstCoach;
        if ((firstCoach == secondCoach))
            System.out.println("singleton");
        else
            System.out.println("prototype, request, global-session, session");
    }

//    2.5 setter injection
//    @Autowired
//    public void setMyCoach(Coach theCoach){
//        myCoach=theCoach;
//    }
    @GetMapping("/workout")
    public String getWorkout(){
        return myCoach.getDailyWorkout();
    }
//  2.7  @PreDestroy
//    @PostConstruct
//    public void destroyBean(){
//        System.out.println("after constructor");
//    }
}
