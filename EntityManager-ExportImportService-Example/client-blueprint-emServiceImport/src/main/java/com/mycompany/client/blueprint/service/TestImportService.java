package com.mycompany.client.blueprint.service;

import com.xchanging.ecf.wiretap.service.WiretappingServiceInterface;



public class TestImportService {
	
	private WiretappingServiceInterface serviceReference;
	

	
	public WiretappingServiceInterface getServiceReference() {
		return serviceReference;
	}



	public void setServiceReference(WiretappingServiceInterface serviceReference) {
		this.serviceReference = serviceReference;
	}



	public void printMessage(){
		serviceReference.getAllElements();
	}

}
