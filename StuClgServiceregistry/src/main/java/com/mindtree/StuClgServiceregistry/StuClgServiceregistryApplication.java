package com.mindtree.StuClgServiceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StuClgServiceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuClgServiceregistryApplication.class, args);
	}

}
