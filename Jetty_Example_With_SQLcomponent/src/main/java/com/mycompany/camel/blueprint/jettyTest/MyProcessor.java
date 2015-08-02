package com.mycompany.camel.blueprint.jettyTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;


public class MyProcessor implements Processor {


	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		//String body = exchange.getIn().getBody(String.class);
		List<Employee> employees = (ArrayList<Employee>) exchange.getIn().getBody();

        try{
            for(Employee employee:employees){
            	//outContent
                //String message = outContent.get("output_obj").toString();
            	System.out.println(employee.getId()+"-"+employee.getName());
            }
        }catch(Exception e){
            e.printStackTrace();;
        }   
		/*System.out.println("Body is: "+body);
		exchange.getOut().setBody("Hello " + body);*/
	}
	
	}
