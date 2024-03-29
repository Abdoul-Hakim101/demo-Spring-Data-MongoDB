package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository repository) {

        return args -> {
            Address address = new Address(
                    "Djibouti",
                    "Djibouti",
                    "50043"
            );
            Student student = new Student(
                    "Abdoul-Hakim",
                    "Mohamed",
                    "Abdihakin18@gmail.com",
                    Gender.MALE,
                    address,
                    List.of("Computer Engineering"),
                    10.02,
                    LocalDateTime.now()
            );
            repository.insert(student);
        };
    }
}
