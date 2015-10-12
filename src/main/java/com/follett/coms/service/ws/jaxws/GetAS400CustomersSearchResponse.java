package com.follett.coms.service.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.follett.coms.service.dto.DtoAS400Customers;

/**
 * @author amahajan
 *
 */
@XmlRootElement(name = "getAS400CustomersResponse", namespace = "http://ws.follett.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAS400CustomersResponse", namespace = "http://ws.follett.com/")
public class GetAS400CustomersSearchResponse {

//	@XmlElementWrapper(name = "customers")
	@XmlElement(name = "customer", nillable = true, type = DtoAS400Customers.class)
	private DtoAS400Customers customers;

	@XmlElement(name = "error", type = String.class, required = false)
	private String errorMessage;

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
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
