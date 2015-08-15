/**
 * PersonService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mycompany.cxf.soap.model;

public interface PersonService_PortType extends java.rmi.Remote {
    public com.mycompany.cxf.soap.model.Person deletePerson(int id) throws java.rmi.RemoteException, com.mycompany.cxf.soap.model.PersonException;
    public com.mycompany.cxf.soap.model.Person putPerson(com.mycompany.cxf.soap.model.Person arg0) throws java.rmi.RemoteException;
    public com.mycompany.cxf.soap.model.Person getPerson(int id) throws java.rmi.RemoteException, com.mycompany.cxf.soap.model.PersonException;
}
