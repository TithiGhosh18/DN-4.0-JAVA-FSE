package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepository repo) {
        return args -> {
            Student s = new Student();
            s.setName("Tithi");
            s.setCity("Kolkata");
            repo.save(s);

            System.out.println("All Students: " + repo.findAll());
        };
    }
}
