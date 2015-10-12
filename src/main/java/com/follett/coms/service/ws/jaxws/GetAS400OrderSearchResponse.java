package com.follett.coms.service.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.follett.coms.service.dto.DtoAS400Orders;

/**
 * @author amahajan
 *
 */
@XmlRootElement(name = "getAS400CustomersRequest", namespace = "http://ws.follett.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAS400CustomersRequest", namespace = "http://ws.follett.com/")
public class GetAS400OrderSearchResponse {

	// @XmlElementWrapper(name = "orders")
	@XmlElement(name = "order", nillable = true, type = DtoAS400Orders.class)
	private DtoAS400Orders order;

	@XmlElement(name = "error", type = String.class, required = false)
	private String errorMessage;

	/**
	 * @return the orderList
	 */
	public DtoAS400Orders getOrder() {
		return order;
	}

	/**
	 * @param orderList
	 *            the orderList to set
	 */
	public void setOrder(DtoAS400Orders order) {
		this.order = order;
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
