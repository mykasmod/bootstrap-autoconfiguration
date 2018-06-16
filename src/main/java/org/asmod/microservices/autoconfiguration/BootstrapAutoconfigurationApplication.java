package org.asmod.microservices.autoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
public class BootstrapAutoconfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapAutoconfigurationApplication.class, args);
	}
}
