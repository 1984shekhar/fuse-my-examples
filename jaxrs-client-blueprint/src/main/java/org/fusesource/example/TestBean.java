package org.fusesource.example;

import java.net.URI;
import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.camel.Exchange;
import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.WebClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean {
    private static final transient Logger LOG = LoggerFactory.getLogger(TestBean.class);

    private CustomerService customerService;

    public void getCustomer(Exchange exchange) {
        Customer customer = exchange.getIn().getBody(Customer.class); 
        LOG.info("*** Invoking getCustomer: id=" + customer.getId() + " name=" + customer.getName());
        WebClient wc = WebClient.fromClient(WebClient.client(customerService));
        URI baseUri = wc.getBaseURI();
        String newUriStr = baseUri.toString() + "/" + customer.getId();  
        WebClient getClient = WebClient.create(newUriStr);
        
        Customer cust = getClient.type(MediaType.APPLICATION_XML_TYPE)
        		                 .accept(MediaType.APPLICATION_XML_TYPE)
        		                 .get(Customer.class);
        if (cust == null) {
       	    LOG.info("Not Found!!!");
        } else {
            LOG.info("Found the customer!!! id=" + cust.getId() + " name=" + cust.getName());
        }
    }

    public void addCustomer(Exchange exchange) {
        Customer customer = exchange.getIn().getBody(Customer.class);   
        LOG.info("*** Invoking addCustomer: id=" + customer.getId() + " name=" + customer.getName());
        WebClient wc = WebClient.fromClient(WebClient.client(customerService));
        Response resp = wc.post(customer);
        
        LOG.info("POST Status: " + resp.getStatus());
        LOG.info("Verifying ADD...");
        String location = resp.getMetadata().getFirst("Location").toString();
        verifyTheCustomer(WebClient.create(location));
    }

    public void updateCustomer(Exchange exchange) {
        Customer customer = exchange.getIn().getBody(Customer.class);  
        LOG.info("*** Invoking updateCustomer: id=" + customer.getId() + " name=" + customer.getName());
        WebClient wc = WebClient.fromClient(WebClient.client(customerService));
        Response resp = wc.put(customer);
        
        LOG.info("PUT Status: " + resp.getStatus());
        
        if (resp.getStatus() == 200) {
            LOG.info("Verifying UPDATE...");
            String location = resp.getMetadata().getFirst("Location").toString();
            verifyTheCustomer(WebClient.create(location));
        } else if (resp.getStatus() == 404) {
            LOG.info("No Such Customer Found for updating!!!");
        }
    }

    public void deleteCustomer(Exchange exchange) {
        Customer customer = exchange.getIn().getBody(Customer.class);
        LOG.info("*** Invoking deleteCustomer: id=" + customer.getId() + " name=" + customer.getName());
        WebClient wc = WebClient.fromClient(WebClient.client(customerService));
        URI baseUri = wc.getBaseURI();
        String newUriStr = baseUri.toString() + "/" + customer.getId();
       
        WebClient deleteClient = WebClient.create(newUriStr);
        Response resp = deleteClient.delete();
        
        LOG.info("DELETE Status: " + resp.getStatus());
        if (resp.getStatus() == 200) {
       	    LOG.info("Verfiying DELETE...");
            String location = resp.getMetadata().getFirst("Location").toString();
            verifyTheCustomer(WebClient.create(location));
        } else if (resp.getStatus() == 404) {
            LOG.info("No Such Customer Found for deleting!!!");
        }
    }
    
    private void verifyTheCustomer(WebClient wc) {
    	Customer cust = wc.type(MediaType.APPLICATION_XML_TYPE).accept(MediaType.APPLICATION_XML_TYPE).get(Customer.class);
        if (cust == null) {
        	LOG.info("Not Found!!! Successfully deleted!!!");
        } else {
        	LOG.info("Fund the customer successfully!!! id=" + cust.getId() + " name=" + cust.getName());
        }
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void getCustomerService() {
        this.customerService = customerService;
    }
}
