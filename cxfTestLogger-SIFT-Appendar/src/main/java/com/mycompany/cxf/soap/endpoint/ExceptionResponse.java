package com.mycompany.cxf.soap.endpoint;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import com.mycompany.cxf.soap.model.PersonException;

public class ExceptionResponse implements Processor {
	   private Logger logger = Logger.getLogger(this.getClass());
	@Override
	public void process(Exchange arg0) throws Exception {
		logger.info("Exception Handling");
		PersonException pe = new PersonException("Exception", "1");
		arg0.getOut().setBody(pe);
	}

}
