package fr.formation.smellyspring; // Typo in package name: "smellysping" instead of "smellyspring"

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmellySpringApplication {

    public static void main(String[] args) {
	SpringApplication.run(SmellySpringApplication.class, args);
    }
}