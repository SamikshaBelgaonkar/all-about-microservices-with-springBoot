package org.survey.techno.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.survey.techno.limitsservice.config.LimitsConfiguration;
import org.survey.techno.limitsservice.entity.Limits;

@RestController
public class LimitsServiceController {

	@Autowired
	private LimitsConfiguration limitsConfiguration;
	@GetMapping("/limits")
	
	public Limits extractLimitsFromConfiguration() {
		return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
		
	}
}
