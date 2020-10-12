package com.cloud.gcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cloud.gcp.controller.LogController;

@SpringBootApplication
public class GcpApplication {

	static Logger logger = LoggerFactory.getLogger(GcpApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GcpApplication.class, args);
		logger.trace("TRACE LOG..GcpApplication accessed.");
		logger.info("INFO LOG..GcpApplication accessed.");
		logger.debug("DEBUG LOG..GcpApplication accessed.");
		logger.error("ERROR LOG..GcpApplication accessed.");
	}

}
