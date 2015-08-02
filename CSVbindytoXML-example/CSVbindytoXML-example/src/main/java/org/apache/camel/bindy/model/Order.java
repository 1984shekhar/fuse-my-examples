package org.apache.camel.bindy.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.log4j.Logger;

/*@XmlSeeAlso(Order.class)*/

@XmlType(name = "Order", propOrder = { "ordersTag" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Order implements Serializable {

	@XmlElement(name = "orderTag")
	protected List<OrderTag> ordersTag = null;

	
	public void setOrdersTag(OrderTag ordersTag) {
		this.getOrdersTag().add(ordersTag);
	}

	public List<OrderTag> getOrdersTag() {
		if (ordersTag == null) {
			ordersTag = new ArrayList<OrderTag>();
		}
		return this.ordersTag;
	}

	public Order() {

		Logger log = Logger.getLogger(getClass());
		log.info("Within OrderClass");

	}

	

	/*
	 * @XmlRootElement
	 * 
	 * @XmlAccessorType(XmlAccessType.FIELD)
	 * 
	 * @XmlType(name = "", propOrder = { "idState", "LabelState",
	 * 
	 * }) public static class Order implements Serializable{ private static
	 * final long serialVersionUID = 1L;
	 * 
	 * @XmlElement(required = true) protected String idState;
	 * 
	 * 
	 * @XmlElement(required = true) protected String LabelState;
	 * 
	 * 
	 * public String getIdState() { return idState; }
	 * 
	 * 
	 * public void setIdState(String idState) { this.idState = idState; }
	 * 
	 * 
	 * public String getLabelState() { return LabelState; }
	 * 
	 * 
	 * public void setLabelState(String labelState) { LabelState = labelState; }
	 * 
	 * }
	 */
}
