package com.mycompany.spring.dm.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

import com.xchanging.ecf.wiretap.service.WiretappingServiceInterface;

public class ActivatorClass implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		ServiceReference serviceReference = null;
		ServiceReference[] serviceReferences= bundleContext.getAllServiceReferences(null, null);
		for(ServiceReference servicereference:serviceReferences){
			
			if((servicereference.toString()).equalsIgnoreCase("[com.xchanging.ecf.wiretap.service.WiretappingServiceInterface]"))
			{
				System.out.println(servicereference.toString());
				serviceReference = servicereference;
			}
		}
		ServiceTracker tracker = new ServiceTracker
			      (bundleContext, WiretappingServiceInterface.class.getName(), null);
		tracker.open();
		WiretappingServiceInterface wiretappingServiceInterface = (WiretappingServiceInterface)tracker.getService(serviceReference);		
		if(wiretappingServiceInterface!=null){
		wiretappingServiceInterface.getAllElements();
		}
		else{
			System.out.println("wiretappingServiceInterface is null");
		}
		//Object obj = arg0.getService(reference);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		// TODO Auto-generated method stub
		ServiceTracker tracker = new ServiceTracker
			      (bundleContext, WiretappingServiceInterface.class.getName(), null);
		tracker.close();
	}

}
