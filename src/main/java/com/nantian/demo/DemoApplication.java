package com.nantian.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        //applicationContext.getBean(DemoService.class).demo();
		SpringApplication.run(DemoApplication.class, args);
	}
}
