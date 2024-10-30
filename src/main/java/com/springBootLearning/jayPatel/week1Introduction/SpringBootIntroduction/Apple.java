package com.springBootLearning.jayPatel.week1Introduction.SpringBootIntroduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {
    public void eatApple() {
        System.out.println("Eating Apple");
    }

    @PostConstruct
    void callPostConstruct(){
        System.out.println("Post Construct called!!");
    }

    @PreDestroy
    void callPreDestroy(){
        System.out.println("Pre Destroy called!!");
    }
}
