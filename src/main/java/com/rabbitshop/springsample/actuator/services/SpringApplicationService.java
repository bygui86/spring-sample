package com.rabbitshop.springsample.actuator.services;

import org.springframework.context.ConfigurableApplicationContext;


public interface SpringApplicationService {

	ConfigurableApplicationContext getConfigurableApplicationContext();

	void shutdownApplication();

}
