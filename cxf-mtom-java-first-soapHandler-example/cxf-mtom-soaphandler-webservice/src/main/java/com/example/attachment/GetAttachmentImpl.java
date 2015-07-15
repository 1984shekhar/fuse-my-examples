package com.example.attachment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import org.apache.commons.io.IOUtils;
import org.apache.cxf.jaxws.context.WrappedMessageContext;
import org.apache.cxf.jaxws.handler.soap.SOAPMessageContextImpl;
import org.apache.cxf.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService
@HandlerChain(file = "handlerchain.xml")
public class GetAttachmentImpl {
	private static Logger logger = LoggerFactory.getLogger(GetAttachmentImpl.class);
	byte[] array = null;
	@Resource
	WebServiceContext serviceContext;

	@WebMethod
	public void getAttachment(String messageId) {
		if(logger.isInfoEnabled()){
		logger.info("Inside getAttachment method ==>");
		logger.info("Messsage Id :: " + messageId);
		}
		try {
			InputStream in = new FileInputStream(System.getProperty("attachment.file"));
			array = new byte[in.available()];
			array = IOUtils.toByteArray(in);
			logger.info("Array length " + array.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		WrappedMessageContext soapContext = (WrappedMessageContext) serviceContext
				.getMessageContext();
		Message cxfmsg = soapContext.getWrappedMessage();
		SOAPMessageContextImpl smci = new SOAPMessageContextImpl(cxfmsg);
		smci.put("attachment", array);

	}

}
