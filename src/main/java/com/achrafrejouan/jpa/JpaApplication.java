package com.achrafrejouan.jpa;

import com.achrafrejouan.jpa.models.Author;
import com.achrafrejouan.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository) {
		return args -> {
			 var author = Author.builder()
					 .firstName("achraf")
					 .lastName("rejouan")
					 .age(22)
					 .email("achrafrejouan@gmail.com")
					 .createdAt(java.time.LocalDateTime.now())
					 .updatedAt(java.time.LocalDateTime.now())
					 .build();
			authorRepository.save(author);};
	}
}
