package com.contactapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = {"com.contactapp.service","com.contactapp.controller","com.contactapp.dao"})
public class Miniproject1ContactAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Miniproject1ContactAppApplication.class, args);
	}

}
