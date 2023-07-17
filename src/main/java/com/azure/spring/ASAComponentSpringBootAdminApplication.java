package com.azure.spring;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ASAComponentSpringBootAdminApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ASAComponentSpringBootAdminApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
