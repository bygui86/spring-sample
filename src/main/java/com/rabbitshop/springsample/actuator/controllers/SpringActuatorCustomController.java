package com.rabbitshop.springsample.actuator.controllers;

import com.rabbitshop.springsample.actuator.services.SpringApplicationService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;


@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter(value = AccessLevel.PROTECTED)
@RestController
@RequestMapping("/actuator/custom")
public class SpringActuatorCustomController {

	@Value("${spring.application.name}")
	String applicationName;

	@Resource(name = "springApplicationService")
	SpringApplicationService springApplicationService;

	@GetMapping("/name")
	public String getAppName() {

		log.debug("Getting application name '{}'...", getApplicationName());

		return getApplicationName();
	}

	/**
	 * PLEASE NOTE: there is no need to specify neither a return statement nor a ResponseStatus, because the application will terminate almost immidiately.
	 */
	@PostMapping("/shutdown")
	public void shutdownApplication() {

		log.warn("Shutting application '{}' down...", getApplicationName());

		getSpringApplicationService().shutdownApplication();
	}

	@PreDestroy
	public void onDestroy() throws Exception {

		log.warn("Spring Container destroy started...");
	}

}
