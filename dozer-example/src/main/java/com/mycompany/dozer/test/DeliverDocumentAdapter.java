package com.mycompany.dozer.test;

import org.apache.camel.Body;


public class DeliverDocumentAdapter extends ModelAdapter {
    
	/*
	 * map Request to Response
	 * 
	 */
	
	public String mapDeliverDocumentResponse(@Body String testInput){
		 
		Request request = new Request();
		request.setA(testInput);
		request.setB(testInput);
				
		Response response = getMapper().map(request, Response.class, "request_response");
		return response.getA1() + ":" + response.getB1();
			
	}
	
}
