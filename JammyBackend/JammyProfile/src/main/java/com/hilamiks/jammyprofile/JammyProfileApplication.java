package com.hilamiks.jammyprofile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class JammyProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(JammyProfileApplication.class, args);
    }

    @Bean
    public static CommandLineRunner runner(Environment env) {
        return args -> {
            Arrays.stream(env.getActiveProfiles()).forEach(System.out::println);
            System.out.println(env.getProperty("secret"));
        };
    }
}
