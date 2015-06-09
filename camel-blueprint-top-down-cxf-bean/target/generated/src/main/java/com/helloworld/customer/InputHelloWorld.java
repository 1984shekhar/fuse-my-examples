
package com.helloworld.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmpCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cmpStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cmpLastUpdated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="evtsCmpEventsStream" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cmpRemarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cmpCompanyName",
    "cmpStatus",
    "cmpLastUpdated",
    "evtsCmpEventsStream",
    "cmpRemarks"
})
@XmlRootElement(name = "inputHelloWorld")
public class InputHelloWorld {

    @XmlElement(required = true)
    protected String cmpCompanyName;
    @XmlElement(required = true)
    protected String cmpStatus;
    @XmlElement(required = true)
    protected String cmpLastUpdated;
    @XmlElement(required = true)
    protected String evtsCmpEventsStream;
    @XmlElement(required = true)
    protected String cmpRemarks;

    /**
     * Gets the value of the cmpCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpCompanyName() {
        return cmpCompanyName;
    }

    /**
     * Sets the value of the cmpCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpCompanyName(String value) {
        this.cmpCompanyName = value;
    }

    /**
     * Gets the value of the cmpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpStatus() {
        return cmpStatus;
    }

    /**
     * Sets the value of the cmpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpStatus(String value) {
        this.cmpStatus = value;
    }

    /**
     * Gets the value of the cmpLastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpLastUpdated() {
        return cmpLastUpdated;
    }

    /**
     * Sets the value of the cmpLastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpLastUpdated(String value) {
        this.cmpLastUpdated = value;
    }

    /**
     * Gets the value of the evtsCmpEventsStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtsCmpEventsStream() {
        return evtsCmpEventsStream;
    }

    /**
     * Sets the value of the evtsCmpEventsStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtsCmpEventsStream(String value) {
        this.evtsCmpEventsStream = value;
    }

    /**
     * Gets the value of the cmpRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpRemarks() {
        return cmpRemarks;
    }

    /**
     * Sets the value of the cmpRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpRemarks(String value) {
        this.cmpRemarks = value;
    }

}
