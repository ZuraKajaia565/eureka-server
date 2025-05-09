package com.zura.eureka_server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EurekaServerApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		// Verify that the context loads successfully
		assertNotNull(applicationContext);
	}

	@Test
	void applicationHasEurekaServerEnabled() {
		// Verify that the main application class is properly annotated
		EnableEurekaServer annotation = EurekaServerApplication.class.getAnnotation(EnableEurekaServer.class);
		assertNotNull(annotation, "Application should be annotated with @EnableEurekaServer");
	}
}