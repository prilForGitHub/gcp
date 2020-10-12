package com.cloud.gcp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cloud.gcp.controller.LogController;

@Service
public class LogService {
	Logger logger = LoggerFactory.getLogger(LogService.class);
	
	public String getValue() {
		logger.trace("TRACE LOG..LogService accessed.");
		logger.info("INFO LOG..LogService accessed.");
		logger.debug("DEBUG LOG..LogService accessed.");
		logger.error("ERROR LOG..LogService accessed.");
		
		return "Logservice says, Hello World!!";
	}

}
