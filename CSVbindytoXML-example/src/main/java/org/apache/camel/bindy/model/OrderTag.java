package org.apache.camel.bindy.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@XmlAccessorType(XmlAccessType.FIELD)
@CsvRecord(separator = ";", skipFirstLine = true, crlf = "UNIX")
public class Order implements Serializable {

	@DataField(pos = 1)
	@XmlElement(required = true)
	private int idState;

	@DataField(pos = 2)
	@XmlElement(required = true)
	private String LabelState;

	public int getIdState() {
		return idState;
	}

	public void setIdState(int idState) {
		this.idState = idState;
	}

	public String getLabelState() {
		return LabelState;
	}

	public void setLabelState(String labelState) {
		LabelState = labelState;
	}

}

/*
 * import org.apache.camel.dataformat.bindy.annotation.CsvRecord; import
 * org.apache.camel.dataformat.bindy.annotation.DataField;
 * 
 * @CsvRecord (separator=",",crlf="UNIX",isOrdered=true,
 * generateHeaderColumns=true) public class DataCsv {
 * 
 * private Long id; private String firstName; private String lastName;
 * 
 * @DataField(name="id",pos=1, position=1) public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * @DataField(name="first_name",pos=2, position=2) public String getFirstName()
 * { return firstName; }
 * 
 * public void setFirstName(String firstName) { this.firstName = firstName; }
 * 
 * @DataField(name="last_name",pos=3, position=3) public String getLastName() {
 * return lastName; }
 * 
 * public void setLastName(String lastName) { this.lastName = lastName; } }
 */