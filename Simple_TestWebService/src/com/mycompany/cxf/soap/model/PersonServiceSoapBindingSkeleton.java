/**
 * PersonServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mycompany.cxf.soap.model;

public class PersonServiceSoapBindingSkeleton implements com.mycompany.cxf.soap.model.PersonService_PortType, org.apache.axis.wsdl.Skeleton {
    private com.mycompany.cxf.soap.model.PersonService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deletePerson", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "person"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "deletePerson"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deletePerson") == null) {
            _myOperations.put("deletePerson", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deletePerson")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("PersonException");
        _fault.setQName(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "PersonException"));
        _fault.setClassName("com.mycompany.cxf.soap.model.PersonException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "PersonException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPerson", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "person"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "getPerson"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPerson") == null) {
            _myOperations.put("getPerson", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPerson")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("PersonException");
        _fault.setQName(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "PersonException"));
        _fault.setClassName("com.mycompany.cxf.soap.model.PersonException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "PersonException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "person"), com.mycompany.cxf.soap.model.Person.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("putPerson", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "person"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "putPerson"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("putPerson") == null) {
            _myOperations.put("putPerson", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("putPerson")).add(_oper);
    }

    public PersonServiceSoapBindingSkeleton() {
        this.impl = new com.mycompany.cxf.soap.model.PersonServiceSoapBindingImpl();
    }

    public PersonServiceSoapBindingSkeleton(com.mycompany.cxf.soap.model.PersonService_PortType impl) {
        this.impl = impl;
    }
    public com.mycompany.cxf.soap.model.Person deletePerson(int id) throws java.rmi.RemoteException, com.mycompany.cxf.soap.model.PersonException
    {
        com.mycompany.cxf.soap.model.Person ret = impl.deletePerson(id);
        return ret;
    }

    public com.mycompany.cxf.soap.model.Person getPerson(int id) throws java.rmi.RemoteException, com.mycompany.cxf.soap.model.PersonException
    {
        com.mycompany.cxf.soap.model.Person ret = impl.getPerson(id);
        return ret;
    }

    public com.mycompany.cxf.soap.model.Person putPerson(com.mycompany.cxf.soap.model.Person arg0) throws java.rmi.RemoteException
    {
        com.mycompany.cxf.soap.model.Person ret = impl.putPerson(arg0);
        return ret;
    }

}
