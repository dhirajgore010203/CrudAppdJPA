package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.UserService;

@SpringBootApplication
public class CrudAppJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudAppJpaApplication.class, args);
	
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
	}

}
