package com.mycompany.cxf.soap.endpoint;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import com.mycompany.cxf.soap.model.Person;

public class TestResponse implements Processor {

	private Logger logger = Logger.getLogger(this.getClass());
	@Override
	public void process(Exchange arg0) throws Exception {
		logger.info("Within TestResponse processor...");
		Person p = new Person();
		p.setAge(29);
		p.setId(1);
		p.setName("Chandra Shekhar");
		arg0.getOut().setBody(p);
		
	}

}
