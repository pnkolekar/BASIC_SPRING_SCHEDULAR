package com.msedcl.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WorkorderDwnldApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkorderDwnldApplication.class, args);
	}

}
