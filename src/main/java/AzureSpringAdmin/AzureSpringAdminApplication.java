package AzureSpringAdmin;

import de.codecentric.boot.admin.server.config.AdminServerHazelcastAutoConfiguration;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = AdminServerHazelcastAutoConfiguration.class)
@EnableAdminServer
@RestController
public class AzureSpringAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureSpringAdminApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
