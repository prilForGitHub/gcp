package com.cloud.gcp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.gcp.service.LogService;

@RestController
public class LogController {
	
	Logger logger = LoggerFactory.getLogger(LogController.class);
	
	@Autowired
	LogService logService;

	@GetMapping
	public String invokeLog() {
		logger.trace("TRACE LOG..LogController accessed.");
		logger.info("INFO LOG..LogController accessed.");
		logger.debug("DEBUG LOG..LogController accessed.");
		logger.error("ERROR LOG..LogController accessed.");
		return logService.getValue();
	}
}
