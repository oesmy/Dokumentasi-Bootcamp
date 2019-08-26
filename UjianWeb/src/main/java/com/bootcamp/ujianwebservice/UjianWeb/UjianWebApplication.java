package com.bootcamp.ujianwebservice.UjianWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bootcamp.ujianwebservice.controller.Controller;

@SpringBootApplication
public class UjianWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UjianWebApplication.class, args);
		Controller.getInstance().saveDataGroup();

	}

}
