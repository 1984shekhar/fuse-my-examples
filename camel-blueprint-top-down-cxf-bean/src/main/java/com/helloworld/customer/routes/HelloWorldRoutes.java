package com.helloworld.customer.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.karaf.shell.console.BundleContextAware;
import org.osgi.framework.BundleContext;
	
/**
 * An interface for implementing Hello services.
 */
public class HelloWorldRoutes extends RouteBuilder implements BundleContextAware {

	BundleContext bundleContext;
	
	@Override
	public void setBundleContext(BundleContext arg0) {
		this.bundleContext = bundleContext;
		
	}

	@Override
	public void configure() throws Exception {		
		from("cxf:bean:helloWorldEndpoint")
		.routeId("helloWorld-inbound")
		.convertBodyTo(com.helloworld.customer.InputHelloWorld.class)		
		.log("Request received from customer")
		.log("${body}")
		.log("CMP_COMPANY_NAME -> ${body.cmpCompanyName}")
		.log("CMP_STATUS -> ${body.cmpStatus}")
		.log("CMP_LAST_UPDATED -> ${body.cmpLastUpdated}")
		.log("EVTS_CMP_EVENTSTREAM -> ${body.evtsCmpEventsStream}")
		.log("CMP_REMARKS -> ${body.cmpRemarks}")
		.to("xslt:xsl/output.xsl");	
	}
	
	
}
