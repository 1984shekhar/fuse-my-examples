package com.mycompany.cxf.soap.client;

import java.net.MalformedURLException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.Logger;

import com.mycompany.cxf.soap.model.Person;
import com.mycompany.cxf.soap.model.PersonService;
public class SoapClient {
	private Logger logger = Logger.getLogger(this.getClass());
	/*	private PersonService personService;
    private static final QName SERVICE_NAME = new QName("PersonService");
    private static final String wsdlLocation = "http://localhost:9000/soap/personService?wsdl"*/;
    public void getPerson(){
    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(com.mycompany.cxf.soap.model.PersonService.class);
        factory.setAddress("http://localhost:9000/soap/personService");
        PersonService client = (PersonService) factory.create();
        int id =2;
        Person result = client.getPerson(id);
        logger.info("AGE: "+result.getAge()+", NAME: "+result.getName());
    }

    public void init() throws MalformedURLException{
    	logger.info(".....Start: SoapClient init method.....");
            getPerson();
         logger.info(".....END: SoapClient init method.....");
    }

}
