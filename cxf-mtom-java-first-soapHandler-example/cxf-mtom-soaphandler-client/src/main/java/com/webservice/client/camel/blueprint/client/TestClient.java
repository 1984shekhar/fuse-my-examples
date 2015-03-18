package com.webservice.client.camel.blueprint.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.example.attachment.GetAttachmentImpl;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
    	factory.setServiceClass(com.example.attachment.GetAttachmentImpl.class);
    	factory.setAddress("http://10.65.193.55:8181/cxf/receivemessage/attachment");
    	GetAttachmentImpl getAttachment = (GetAttachmentImpl)factory.create();
    	getAttachment.getAttachment("1");
    	
	}

}
