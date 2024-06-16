package com.demo.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"<com.demo.insurance>"})
@EnableJpaRepositories(basePackages="<com.demo.insurance.repository>")
@EntityScan(basePackages="<com.demo.insurance.entities>")
public class InsuranceFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceFinalApplication.class, args);
	}

}
