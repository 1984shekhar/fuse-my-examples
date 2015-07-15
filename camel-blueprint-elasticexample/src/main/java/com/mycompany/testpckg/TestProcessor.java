package com.mycompany.testpckg;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class TestProcessor implements Processor {
	  
	@Override
	public void process(Exchange exchange) throws Exception {
		@SuppressWarnings("unchecked")
		Map<String,String> ht = new HashMap<String, String>();
		ht.put("content", "test");
		exchange.getIn().setBody(ht, HashMap.class);;
	}
}
