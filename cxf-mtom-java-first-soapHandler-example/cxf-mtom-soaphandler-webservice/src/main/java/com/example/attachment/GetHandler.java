package com.example.attachment;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.cxf.jaxws.context.WrappedMessageContext;
import org.apache.cxf.jaxws.handler.soap.SOAPMessageContextImpl;
import org.apache.cxf.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.mail.util.ByteArrayDataSource;
import javax.activation.DataHandler;

public class GetHandler implements  SOAPHandler<SOAPMessageContext>{

	private Logger logger = LoggerFactory.getLogger(GetHandler.class);
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
	logger.info("Inside Handler");	
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(outboundProperty)        {
			addAttachment(context);
                }
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

    private void addAttachment(SOAPMessageContext messageContext)
    {		
    		if(logger.isInfoEnabled()){
    			logger.info("Inside handler addAttachment Method");
    		}
    	 	byte[] byt = null;
    		SOAPMessage message;
     		AttachmentPart attach;
     		byt = (byte[]) messageContext.get("attachment");
			WrappedMessageContext wmc = (WrappedMessageContext) messageContext;
			Message cxfmsg = wmc.getWrappedMessage();
			SOAPMessageContextImpl smci = new SOAPMessageContextImpl(cxfmsg);
			message = smci.getMessage();
			if(byt != null)	{
			         logger.info("Attachment content :::" + new String(byt));	
                                 ByteArrayDataSource source = new ByteArrayDataSource(byt, "Multipart/Related");
                                 DataHandler dataHandler = new DataHandler(source);
			         //attach = message.createAttachmentPart(byt, "Multipart/Related");
                                 attach = message.createAttachmentPart(dataHandler);
			         //attach.setMimeHeader("attc", "abcd");
			         //attach.setContentId("1234567");

			         attach.setMimeHeader("KeyA", "ValueA");
			         attach.setContentId("1234567");
			         logger.info("Content Id :: " + attach.getContentId());
			         message.addAttachmentPart(attach);
			}
			  messageContext.setMessage(message);
			}
     		
}
