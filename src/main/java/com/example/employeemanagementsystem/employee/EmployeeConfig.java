package com.example.employeemanagementsystem.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repo){
        return args -> {
            Employee e = new Employee(
                    10.0,
                    "asdf",
                    "asdf.asdf",
                    "asf"
            );

            repo.saveAll(List.of(e));
        };
    }
}
