package com.appiancorp.plugins.appianworld.advancedplugins.datatypes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for AddressDataType custom type.
 * 
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AW_AddressDataType", namespace="urn:appian:plugins:appianworld:advancedplugins", propOrder = {
    "addressId",
    "addressType",
    "line1",
    "line2",
    "city",
    "zipcode",
    "state",
    "country",
    "customerId"
})
public class AddressDataType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement(required = true, type = Integer.class)
	protected Integer addressId;
	
	@XmlElement(required = true)
	protected String addressType;
	
	@XmlElement(required = true)
	protected String line1;
	
	@XmlElement(required = false)
	protected String line2;
	
	@XmlElement(required = true)
	protected String city;
	
	@XmlElement(required = true)
	protected String zipcode;
	
	@XmlElement(required = false)
	protected String state;
	
	@XmlElement(required = true)
	protected String country;
	
	@XmlElement(required = true)
	protected Integer customerId;

	public AddressDataType() {}
	
	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
}
