package com.follett.coms.service.dto;

import java.math.BigDecimal;

/**
 * @author amahajan
 *
 */
public class DtoAS400ContactInformation {

	private BigDecimal contactId;

	private DtoAS400Customers customers;

	private DtoAS400BillShipInformation billShipInfo;

	private String contactName;

	private String orderNumber;

	private String orderSuffix;

	/**
	 * @return the contactId
	 */
	public BigDecimal getContactId() {
		return contactId;
	}

	/**
	 * @param contactId
	 *            the contactId to set
	 */
	public void setContactId(BigDecimal contactId) {
		this.contactId = contactId;
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
	 * @return the billShipInfo
	 */
	public DtoAS400BillShipInformation getBillShipInfo() {
		return billShipInfo;
	}

	/**
	 * @param billShipInfo
	 *            the billShipInfo to set
	 */
	public void setBillShipInfo(DtoAS400BillShipInformation billShipInfo) {
		this.billShipInfo = billShipInfo;
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

}
