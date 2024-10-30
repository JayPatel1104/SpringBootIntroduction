package com.springBootLearning.jayPatel.week1Introduction.SpringBootIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntroductionApplication implements CommandLineRunner {

	@Autowired
	Apple apple;

	@Autowired
	Apple apple1;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroductionApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		apple.eatApple();
		apple.eatApple();

		System.out.println(apple.hashCode());
		System.out.println(apple1.hashCode());
	}
}
