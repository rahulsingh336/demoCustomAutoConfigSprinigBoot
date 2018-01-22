package com.rs.springframework.demoCustomAutoConfig;

import com.rs.springframework.demoCustomAutoConfig.custom.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoCustomAutoConfigApplication {

	private GreetingService greetingService;

	@Autowired
	private ApplicationContext context;

	public DemoCustomAutoConfigApplication(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoCustomAutoConfigApplication.class, args);
	}

	@PostConstruct
	void init(){
		System.out.println("Get Greeting Service :: ");
		System.out.println(greetingService.getGreeting());
	}

}
