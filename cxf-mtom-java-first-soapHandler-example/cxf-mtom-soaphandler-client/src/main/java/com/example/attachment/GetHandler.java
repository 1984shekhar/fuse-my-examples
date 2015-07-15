package com.example.attachment;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.cxf.jaxws.context.WrappedMessageContext;
import org.apache.cxf.jaxws.handler.soap.SOAPMessageContextImpl;
import org.apache.cxf.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetHandler implements  SOAPHandler<SOAPMessageContext>{

	private Logger logger = LoggerFactory.getLogger(GetHandler.class);
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
	logger.info("Inside Handler");	
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(!outboundProperty)
        {   logger.info("Inside GetHandler Client");
			findAttachment(context);
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

    private void findAttachment(SOAPMessageContext messageContext)
    {		
    	Iterator attachments = messageContext.getMessage().getAttachments();
        while (attachments.hasNext()) {
            AttachmentPart attachment = (AttachmentPart) attachments
                    .next();
            
            logger.info("### Start Attachment ###"
                    + attachment.getContentId() + attachment.getMimeHeader("KeyA")[0]
                    + attachment.getContentType() + ":"
                    + attachment.getContentLocation());
            try {
				attachment.getDataHandler().writeTo(System.out);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("### End Attachment ###");
        }
			}
     		
}
