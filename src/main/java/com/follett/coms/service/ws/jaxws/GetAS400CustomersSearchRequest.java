package com.follett.coms.service.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author amahajan
 *
 */
@XmlRootElement(name = "getAS400CustomersRequest", namespace = "http://ws.follett.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAS400CustomersRequest", namespace = "http://ws.follett.com/")
public class GetAS400CustomersSearchRequest {

	@XmlElement(name = "customerNumber", required = false, type = Long.class)
	private long customerNumber;

	@XmlElement(name = "customerName", required = false, type = String.class)
	private String customerName;

	@XmlElement(name = "mdrPermanentIdNumber", required = false, type = String.class)
	private String mdrPermanentIdNumber;

	@XmlElement(name = "addressLineOne", required = false, type = String.class)
	private String addressLineOne;

	@XmlElement(name = "phoneNumber", required = false, type = Long.class)
	private long phoneNumber;

	@XmlElement(name = "city", required = false, type = String.class)
	private String city;

	@XmlElement(name = "state", required = false, type = String.class)
	private String state;

	@XmlElement(name = "postalCode", required = false, type = String.class)
	private String postalCode;

	@XmlElement(name = "nation", required = false, type = String.class)
	private String nation;

	@XmlElement(name = "contactName", required = false, type = String.class)
	private String contactName;

	/**
	 * @return the customerNumber
	 */
	public long getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @param customerNumber
	 *            the customerNumber to set
	 */
	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the mdrPermanentIdNumber
	 */
	public String getMdrPermanentIdNumber() {
		return mdrPermanentIdNumber;
	}

	/**
	 * @param mdrPermanentIdNumber
	 *            the mdrPermanentIdNumber to set
	 */
	public void setMdrPermanentIdNumber(String mdrPermanentIdNumber) {
		this.mdrPermanentIdNumber = mdrPermanentIdNumber;
	}

	/**
	 * @return the addressLineOne
	 */
	public String getAddressLineOne() {
		return addressLineOne;
	}

	/**
	 * @param addressLineOne
	 *            the addressLineOne to set
	 */
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the nation
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * @param nation
	 *            the nation to set
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}

	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @param contactName
	 *            the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetAS400CustomersRequest [customerNumber=" + customerNumber
				+ ", customerName=" + customerName + ", mdrPermanentIdNumber="
				+ mdrPermanentIdNumber + ", addressLineOne=" + addressLineOne
				+ ", phoneNumber=" + phoneNumber + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode
				+ ", nation=" + nation + ", contactName=" + contactName + "]";
	}

}
