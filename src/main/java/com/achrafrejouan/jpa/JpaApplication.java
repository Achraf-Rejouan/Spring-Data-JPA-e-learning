package com.achrafrejouan.jpa;

import com.achrafrejouan.jpa.models.Author;
import com.achrafrejouan.jpa.models.Video;
import com.achrafrejouan.jpa.repositories.AuthorRepository;
import com.achrafrejouan.jpa.repositories.VideoRepository;
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
    public CommandLineRunner commandLineRunner
            (
                    AuthorRepository authorRepository,
                    VideoRepository videoRepository
            ) {
        return args -> {
			 /* var author = Author.builder()
					 .firstName("achraf")
					 .lastName("rejouan")
					 .age(22)
					 .email("achrafrejouan@gmail.com")
					 .createdAt(java.time.LocalDateTime.now())
					 .updatedAt(java.time.LocalDateTime.now())
					 .build();
			authorRepository.save(author);*/
            var video = Video.builder()
                    .name("ABC")
                    .length(120)
                    .build();
            videoRepository.save(video);
        };
    }
}
