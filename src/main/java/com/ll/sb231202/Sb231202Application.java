package com.ll.sb231202;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Sb231202Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb231202Application.class, args);
	}

}
