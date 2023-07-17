package com.azure.spring;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableAdminServer
public class ASAComponentSpringBootAdminApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ASAComponentSpringBootAdminApplication.class, args);
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void run(String... args) {
        String sql = "INSERT INTO users (fullname, email, password) VALUES (?, ?, ?)";

        int result = jdbcTemplate.update(sql, "Ravi Kumar", "ravi.kumar@gmail.com", "ravi2021");

        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }
    }
}
