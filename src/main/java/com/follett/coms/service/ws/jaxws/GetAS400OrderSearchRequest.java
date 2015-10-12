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
@XmlRootElement(name = "getAS400OrderSearchRequest", namespace = "http://ws.follett.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAS400OrderSearchRequest", namespace = "http://ws.follett.com/")
public class GetAS400OrderSearchRequest {

	@XmlElement(name = "orderNumber", required = false, type = Long.class)
	private long orderNumber;

	@XmlElement(name = "orderSuffix", required = false, type = String.class)
	private String orderSuffix;

	@XmlElement(name = "customerNumber", required = false, type = Long.class)
	private long customerNumber;

	@XmlElement(name = "quoteNumber", required = false, type = Long.class)
	private long quoteNumber;

	@XmlElement(name = "customerName", required = false, type = String.class)
	private String customerName;

	@XmlElement(name = "poNumber", required = false, type = Long.class)
	private long poNumber;

	@XmlElement(name = "city", required = false, type = String.class)
	private String city;

	@XmlElement(name = "state", required = false, type = String.class)
	private String state;

	@XmlElement(name = "zip", required = false, type = String.class)
	private String zip;

	@XmlElement(name = "nation", required = false, type = String.class)
	private String nation;

	@XmlElement(name = "orderStatus", required = false, type = String.class)
	private String Status;

	@XmlElement(name = "orderId", required = false, type = Long.class)
	private long orderId;

	/**
	 * @return the orderNumber
	 */
	public long getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(long orderNumber) {
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
	 * @return the quoteNumber
	 */
	public long getQuoteNumber() {
		return quoteNumber;
	}

	/**
	 * @param quoteNumber
	 *            the quoteNumber to set
	 */
	public void setQuoteNumber(long quoteNumber) {
		this.quoteNumber = quoteNumber;
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
	 * @return the poNumber
	 */
	public long getPoNumber() {
		return poNumber;
	}

	/**
	 * @param poNumber
	 *            the poNumber to set
	 */
	public void setPoNumber(long poNumber) {
		this.poNumber = poNumber;
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
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
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
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}

	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

}
