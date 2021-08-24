package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootApp4Application.class, args);
		String s="Java";
		int a=60;
		int b=80;
		int add=a+b;
		System.out.println("addition "+add);
		System.out.println(s.length());
		
	}

}
