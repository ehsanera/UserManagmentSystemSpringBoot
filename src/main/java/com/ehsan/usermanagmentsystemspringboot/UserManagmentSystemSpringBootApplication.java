package com.ehsan.usermanagmentsystemspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
public class UserManagmentSystemSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagmentSystemSpringBootApplication.class, args);
    }

}
