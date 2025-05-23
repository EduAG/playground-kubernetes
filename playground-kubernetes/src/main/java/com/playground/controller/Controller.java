package com.playground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

@RestController
@RequestMapping("/app")
public class Controller {
	
	Faker faker = new Faker();
	
	@GetMapping
	public String getUser() {
		return faker.getClass().getName();
	}
}
