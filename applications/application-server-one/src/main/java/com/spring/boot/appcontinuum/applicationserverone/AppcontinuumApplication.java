package com.spring.boot.appcontinuum.applicationserverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("example.hello")
public class AppcontinuumApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppcontinuumApplication.class, args);
	}
}
