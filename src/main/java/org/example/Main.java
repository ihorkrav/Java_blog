package org.example;

import org.example.services.DatabaseSeeder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        SpringApplication.run(Main.class, args);

    }

    @Bean
    CommandLineRunner runner(DatabaseSeeder init) {
        return args -> {
            init.SeedAllTables();

        };
    }
}


