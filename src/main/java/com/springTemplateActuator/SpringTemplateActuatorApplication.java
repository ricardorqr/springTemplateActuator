package com.springTemplateActuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SpringTemplateActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTemplateActuatorApplication.class, args);
    }

}
