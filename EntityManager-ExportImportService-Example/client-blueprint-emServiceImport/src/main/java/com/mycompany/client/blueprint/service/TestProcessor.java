package com.mycompany.client.blueprint.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;



public class TestProcessor implements Processor {
	private Logger log = Logger.getLogger(TestProcessor.class);
	private TestImportService testImportService;
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		log.info("Inside TestProcessor...");
		testImportService.printMessage();
	}
	public TestImportService getTestImportService() {
		return testImportService;
	}
	public void setTestImportService(TestImportService testImportService) {
		this.testImportService = testImportService;
	}

}
