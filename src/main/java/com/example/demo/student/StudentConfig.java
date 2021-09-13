package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student pavan = new Student(
					"Pavan",
					"pavannerella28@gmail.com",
					LocalDate.of(2000, Month.JANUARY, 5)
			);
			Student chinna = new Student(
					"Chinna",
					"7radha3krishna@gmail.com",
					LocalDate.of(2001, Month.MARCH, 5)
			);
			Student mohan = new Student(
					"Mohan",
					"mvamsi73@gmail.com",
					LocalDate.of(2002, Month.APRIL, 5)
			);
			
			repository.saveAll(
					List.of(pavan, chinna, mohan)
			);
		};
	}
}
