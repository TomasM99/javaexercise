package com.javaexercise.javaexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaExerciseApplication {

	private static UserService service;

	@Autowired
	public JavaExerciseApplication(UserService service) {
		JavaExerciseApplication.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaExerciseApplication.class, args);
		System.out.println("Hello world");

		User userTest = new User("Tomas", "Tomas@gmail.com", 24);

		service.createUser(userTest);

		System.out.println(service.getUser(1L));
	}

}
