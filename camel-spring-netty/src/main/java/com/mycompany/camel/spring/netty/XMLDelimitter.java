package com.mycompany.camel.spring.netty;


import java.nio.charset.Charset;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

public class XMLDelimitter {

	public ChannelBuffer getXMLDelimiter() {
		return ChannelBuffers.copiedBuffer("</XML>", Charset.defaultCharset());
	}
}
