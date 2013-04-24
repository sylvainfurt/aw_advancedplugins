/**
 * 
 */
package com.appiancorp.plugins.appianworld.advancedplugins.datatypes;

import java.util.Date;
import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.appiancorp.suiteapi.process.palette.IdentityManagement;

/**
 * Java class for CustomerDataType custom type.
 * 
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AW_CustomerDataType", namespace="urn:appian:plugins:appianworld:advancedplugins", propOrder = {
    "customerId",
    "name",
    "nickname",
    "status",
    "startDate",
    "endDate",
    "pocName",
    "addresses"
})
public class CustomerDataType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement(required = true, type = Integer.class)
	protected Integer customerId;
	
	@XmlElement(required = true)
	protected String name;
	
	@XmlElement(required = false)
	protected String nickname;
	
	@XmlElement(required = true, type = Integer.class)
	protected Integer status;
	
	@XmlElement(required = true)
	protected Date startDate;
	
	@XmlElement(required = false)
	protected Date endDate;
	
	@XmlElement(required = true)
	protected String pocName;

	@OneToMany
    @JoinColumn(name="customerid")
	protected Set<AddressDataType> addresses;
	
	public CustomerDataType() {}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPocName() {
		return pocName;
	}

	public void setPocName(String pocName) {
		this.pocName = pocName;
	}

	public Set<AddressDataType> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<AddressDataType> addresses) {
		this.addresses = addresses;
	}


	
}
