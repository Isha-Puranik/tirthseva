package com.tirthseva.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TirthSevaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TirthSevaApplication.class, args);
        
        System.out.println("============================================================");
        System.out.println("TirthSeva Spring Boot API is running!");
        System.out.println("============================================================");
        System.out.println("Environment: Development");
        System.out.println("API URL: http://localhost:8080");
        System.out.println("Swagger UI: http://localhost:8080/swagger-ui.html");
        System.out.println("============================================================");
        System.out.println("\nTest Accounts Available:");
        System.out.println("- Admin: admin@tirthseva.com / Admin@123");
        System.out.println("- User: ramesh@example.com / User@123");
        System.out.println("- Provider 1: suresh@example.com / Provider@123");
        System.out.println("- Provider 2: mahesh@example.com / Provider@123");
        System.out.println("============================================================");
    }
}
