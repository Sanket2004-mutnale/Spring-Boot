package com.SpringBoot.Springbootapplication2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springbootapplication2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springbootapplication2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		student().displayStuDetails();
		student1().displayStuDetails();
	}
	@Bean
	public Student student() {
		return new Student("Sanket",28,98.2f);
	}
	
	@Bean
	public Student student1() {
		return new Student("Swapanil",28,98.2f);
	}
	
	

}
