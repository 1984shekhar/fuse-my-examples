package org.apache.camel.bindy.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.apache.log4j.Logger;

/*@XmlSeeAlso(Order.class)*/


@XmlRootElement(name = "OrderBase")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBase", propOrder = { "id", "order" })
public class OrderBase implements Serializable {

	private int id = 1;
	
	@XmlElement(name = "order")
	protected List<Order> order = null;

	public List<Order> getOrders() {
		if (order == null) {
			order = new ArrayList<Order>();
		}
		return this.order;
	}

	public OrderBase() {

		Logger log = Logger.getLogger(getClass());
		log.info("REACHED MARSHALLER");

	}

	public void setOrder(Order order) {
		this.getOrders().add(order);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = 1;
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
