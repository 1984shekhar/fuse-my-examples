package com.mycompany.test;

import org.apache.log4j.Logger;



public class TestResponse {

	private Logger logger = Logger.getLogger(this.getClass());
	
public void process() throws Exception{
	throw new Exception("Throwing Exception...");
}

}
