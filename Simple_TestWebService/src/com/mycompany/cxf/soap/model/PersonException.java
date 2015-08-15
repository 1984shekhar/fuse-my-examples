/**
 * PersonException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mycompany.cxf.soap.model;

public class PersonException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String[] classContext;

    private java.lang.String personid;

    private java.lang.String message1;

    public PersonException() {
    }

    public PersonException(
           java.lang.String[] classContext,
           java.lang.String personid,
           java.lang.String message1) {
        this.classContext = classContext;
        this.personid = personid;
        this.message1 = message1;
    }


    /**
     * Gets the classContext value for this PersonException.
     * 
     * @return classContext
     */
    public java.lang.String[] getClassContext() {
        return classContext;
    }


    /**
     * Sets the classContext value for this PersonException.
     * 
     * @param classContext
     */
    public void setClassContext(java.lang.String[] classContext) {
        this.classContext = classContext;
    }

    public java.lang.String getClassContext(int i) {
        return this.classContext[i];
    }

    public void setClassContext(int i, java.lang.String _value) {
        this.classContext[i] = _value;
    }


    /**
     * Gets the personid value for this PersonException.
     * 
     * @return personid
     */
    public java.lang.String getPersonid() {
        return personid;
    }


    /**
     * Sets the personid value for this PersonException.
     * 
     * @param personid
     */
    public void setPersonid(java.lang.String personid) {
        this.personid = personid;
    }


    /**
     * Gets the message1 value for this PersonException.
     * 
     * @return message1
     */
    public java.lang.String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this PersonException.
     * 
     * @param message1
     */
    public void setMessage1(java.lang.String message1) {
        this.message1 = message1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonException)) return false;
        PersonException other = (PersonException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classContext==null && other.getClassContext()==null) || 
             (this.classContext!=null &&
              java.util.Arrays.equals(this.classContext, other.getClassContext()))) &&
            ((this.personid==null && other.getPersonid()==null) || 
             (this.personid!=null &&
              this.personid.equals(other.getPersonid()))) &&
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getClassContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersonid() != null) {
            _hashCode += getPersonid().hashCode();
        }
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.soap.cxf.mycompany.com/", "PersonException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
