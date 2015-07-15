package com.mycompany.ImportServiceSpringExample;

import com.mycompany.exampleSpringDM.Hello;

public class TestImportService {
	
	private Hello serviceReference;

	public Hello getServiceReference() {
		return serviceReference;
	}

	public void setServiceReference(Hello serviceReference) {
		this.serviceReference = serviceReference;
	}
	
	public void printMessage(){
		serviceReference.printMe();
	}

}
