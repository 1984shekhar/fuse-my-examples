/**
 * PersonServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mycompany.cxf.soap.model;

public class PersonServiceSoapBindingImpl implements com.mycompany.cxf.soap.model.PersonService_PortType{
    public com.mycompany.cxf.soap.model.Person deletePerson(int id) throws java.rmi.RemoteException, com.mycompany.cxf.soap.model.PersonException {
        return null;
    }

    public com.mycompany.cxf.soap.model.Person getPerson(int id) throws java.rmi.RemoteException, com.mycompany.cxf.soap.model.PersonException {
        Person person = new Person();
        person.setAge(50);
        person.setId(1);
        person.setName("Amit Sharma");
    	return person;
    }

    public com.mycompany.cxf.soap.model.Person putPerson(com.mycompany.cxf.soap.model.Person arg0) throws java.rmi.RemoteException {
        return null;
    }

}
