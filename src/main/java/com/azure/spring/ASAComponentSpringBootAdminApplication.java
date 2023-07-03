package com.azure.spring;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAdminServer
public class ASAComponentSpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ASAComponentSpringBootAdminApplication.class, args);
    }

}
