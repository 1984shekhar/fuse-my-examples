package com.mycompany.dozer.test;

import org.apache.camel.converter.dozer.DozerTypeConverterLoader;
import org.dozer.DozerBeanMapper;



public abstract class ModelAdapter {

	private DozerTypeConverterLoader dozerTypeConverterLoader; 
	
	static private String ltoErrorPrefix = "[LTO ERROR]: ";
	
	public DozerBeanMapper getMapper() {
		
		return this.dozerTypeConverterLoader.getMapper();
	}
	
	public String getLtoErrorPrefix(){
		return ltoErrorPrefix;
	}
	
	public DozerTypeConverterLoader getLoader() {
		return dozerTypeConverterLoader;
	}
	public void setLoader(DozerTypeConverterLoader loader) {
		this.dozerTypeConverterLoader = loader;
	}
}
