package com.equas.core.equas.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author shriman-dev
 *
 */
@SpringBootApplication
@EntityScan("com.equas.core")
@ComponentScan("com.equas.core")
@RestController
@CrossOrigin(allowCredentials = "true")
@EnableJpaRepositories("com.equas.core.equas.repository")
@EnableAutoConfiguration
public class EquasBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquasBootApplication.class, args);
	}

	@RequestMapping("health")
	public String status() {
		return "Application is Up";
	}
}
