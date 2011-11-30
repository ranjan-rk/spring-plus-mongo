package com.example.spring.mongo.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = { "id", "name", "designation", "joiningDate", "department" })
public class Employee implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Designation", required = true)
    protected String designation;
    @XmlElement(name = "JoiningDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar joiningDate;
    @XmlElement(name = "Department", required = true)
    protected String department;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
	return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
	this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
	return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
	this.name = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDesignation() {
	return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDesignation(String value) {
	this.designation = value;
    }

    /**
     * Gets the value of the joiningDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getJoiningDate() {
	return joiningDate;
    }

    /**
     * Sets the value of the joiningDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setJoiningDate(XMLGregorianCalendar value) {
	this.joiningDate = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDepartment() {
	return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDepartment(String value) {
	this.department = value;
    }

}
