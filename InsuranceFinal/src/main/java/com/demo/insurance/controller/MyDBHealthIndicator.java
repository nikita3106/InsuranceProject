package com.demo.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.demo.insurance.service.MyDBService;


@Component
public class MyDBHealthIndicator implements HealthIndicator {

	 @Autowired
	    private MyDBService myDBService;

	    @Override
	    public Health health() {
	        if (myDBService.isDatabaseUp()) {
	            return Health.up().withDetail("Database Service", "Running").build();
	        } else {
	            return Health.down().withDetail("Database Service", "Not Running").build();
	        }
	    }
}
