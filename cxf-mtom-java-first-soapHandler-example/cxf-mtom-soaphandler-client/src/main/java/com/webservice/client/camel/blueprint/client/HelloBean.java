package com.webservice.client.camel.blueprint.client;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.example.attachment.GetAttachment;
import com.example.attachment.GetAttachmentImpl;

/**
 * A bean which we use in the route
 */
public class HelloBean implements Hello {

    private String say = "Hello World";

    public String hello() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return say + " at " + sdf.format(new Date());
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
    
    public void init(){
    	System.out.println("Inside Init........");
    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
    	factory.setServiceClass(com.example.attachment.GetAttachmentImpl.class);
    	factory.setAddress("http://localhost:8181/cxf/receivemessage/attachment");
    	GetAttachmentImpl getAttachment = (GetAttachmentImpl)factory.create();
    	getAttachment.getAttachment("1");
    	
    }
}
