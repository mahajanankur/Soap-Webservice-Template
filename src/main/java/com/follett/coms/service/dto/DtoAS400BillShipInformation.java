package com.follett.coms.service.dto;

import java.util.Set;

/**
 * @author amahajan
 *
 */
public class DtoAS400BillShipInformation {

	private long billShipId;

	private DtoAS400Customers customers;

	private String attention;

	private String billShipType;

	private String customerName;

	private String address1;

	private String address2;

	private String city;

	private String state;

	private String postalCode;

	private String orderNumber;

	private String orderSuffix;

	private Set<DtoAS400ContactInformation> contactInfo;

	/**
	 * @return the billShipId
	 */
	public long getBillShipId() {
		return billShipId;
	}

	/**
	 * @param billShipId
	 *            the billShipId to set
	 */
	public void setBillShipId(long billShipId) {
		this.billShipId = billShipId;
	}

	/**
	 * @return the customers
	 */
	public DtoAS400Customers getCustomers() {
		return customers;
	}

	/**
	 * @param customers
	 *            the customers to set
	 */
	public void setCustomers(DtoAS400Customers customers) {
		this.customers = customers;
	}

	/**
	 * @return the attention
	 */
	public String getAttention() {
		return attention;
	}

	/**
	 * @param attention
	 *            the attention to set
	 */
	public void setAttention(String attention) {
		this.attention = attention;
	}

	/**
	 * @return the billShipType
	 */
	public String getBillShipType() {
		return billShipType;
	}

	/**
	 * @param billShipType
	 *            the billShipType to set
	 */
	public void setBillShipType(String billShipType) {
		this.billShipType = billShipType;
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
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1
	 *            the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2
	 *            the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
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
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the orderSuffix
	 */
	public String getOrderSuffix() {
		return orderSuffix;
	}

	/**
	 * @param orderSuffix
	 *            the orderSuffix to set
	 */
	public void setOrderSuffix(String orderSuffix) {
		this.orderSuffix = orderSuffix;
	}

	/**
	 * @return the contactInfo
	 */
	public Set<DtoAS400ContactInformation> getContactInfo() {
		return contactInfo;
	}

	/**
	 * @param contactInfo
	 *            the contactInfo to set
	 */
	public void setContactInfo(Set<DtoAS400ContactInformation> contactInfo) {
		this.contactInfo = contactInfo;
	}

}
