

package com.marshal.camel.test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.Name;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.bindy.model.ObjectFactory;
import org.apache.camel.bindy.model.Order;
import org.apache.camel.bindy.model.OrderTag;
import org.apache.camel.bindy.model.OrderBase;
import org.apache.log4j.Logger;


public class Student1 implements Processor{
	
	
	@Override
	public void process(Exchange arg0) throws Exception {
		// TODO Auto-generated method stub
		 Logger log = Logger.getLogger(getClass());
		log.info("Within Student1 Processor...");
		List<Map<String, OrderTag>> unmarshaledModels = (List<Map<String, OrderTag>>) arg0.getIn().getBody();
		
		ObjectFactory objectFactory = new ObjectFactory();
		OrderBase orderBase = objectFactory.createOrderBase();
		Order order = objectFactory.createOrder();
		Iterator<Map<String, OrderTag>> orderIterator = unmarshaledModels.iterator();
      while (orderIterator.hasNext()) {
         Map<String, OrderTag> orderMap = orderIterator.next();
         
         order.setOrdersTag(orderMap.get(OrderTag.class.getName()));
      }
      orderBase.setOrder(order);
      arg0.getIn().setBody(orderBase);
	

		/*int modelCount = 0;
		
		
		List<Map<String, Object>> list; // this is what you have already

		for (Map<String, Object> map : unmarshaledModels) {
			log.info("Within Map: "+map.size());
		    for (Map.Entry<String, Object> entry : map.entrySet()) {
		        String key = entry.getKey();
		        Object value = entry.getValue();
		        
		        Order order=(Order) value;
		        
		        
		        log.info("key "+key +"    value" +value.toString());
		        
		        log.info("    DATA IN VALUE (ORDER OBJECT) "+order.getLabelState() );
		        
		    }
		}
		
		*/
		/*for (Map<String, Object> model : unmarshaledModels) {
		  for (String className : model.keySet()) {
		     Object obj = model.get(className);
		     log.info("CLASS NAME "+className);
		     
		     log.info("Count : " + modelCount + ", " + obj.toString());
		  }
		 modelCount++;
		}
		*/
	}
	
	
	

	
	 
}