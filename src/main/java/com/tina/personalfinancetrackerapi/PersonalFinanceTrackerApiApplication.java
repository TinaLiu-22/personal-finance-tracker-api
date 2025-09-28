package com.tina.personalfinancetrackerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulithic;

@Modulithic
@SpringBootApplication
public class PersonalFinanceTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalFinanceTrackerApiApplication.class, args);
	}

}
