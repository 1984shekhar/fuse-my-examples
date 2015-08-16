package com.mycompany.client;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

import com.mycompany.cxf.soap.skeleton.Person;
import com.mycompany.cxf.soap.skeleton.PersonException_Exception;
import com.mycompany.cxf.soap.skeleton.PersonService;

public class ClientInvoker {
	private PersonService personService;
	private Logger logger = Logger.getLogger(this.getClass());
	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public void getPerson(Exchange e) throws PersonException_Exception{
		logger.info("Within GetPerson...");
		Person person = personService.getPerson(12);
		com.mycompany.cxf.soap.model.Person p = new com.mycompany.cxf.soap.model.Person();
		p.setAge(person.getAge());
		p.setId(person.getId());
		p.setName(person.getName());
		e.getOut().setBody(p);
		//System.out.println("Name: "+person.getName());
		
	}

}
