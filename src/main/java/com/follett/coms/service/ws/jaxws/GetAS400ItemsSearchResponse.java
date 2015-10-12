package com.follett.coms.service.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.follett.coms.service.dto.DtoAS400Items;

/**
 * @author amahajan
 *
 */
@XmlRootElement(name = "getAS400ItemsSearchRequest", namespace = "http://ws.follett.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAS400ItemsSearchRequest", namespace = "http://ws.follett.com/")
public class GetAS400ItemsSearchResponse {

//	@XmlElementWrapper(name = "items")
	@XmlElement(name = "item", nillable = true, type = DtoAS400Items.class)
	private DtoAS400Items item;

	@XmlElement(name = "error", type = String.class, required = false)
	private String errorMessage;

	/**
	 * @return the itemList
	 */
	public DtoAS400Items getItem() {
		return item;
	}

	/**
	 * @param itemList
	 *            the itemList to set
	 */
	public void setItem(DtoAS400Items item) {
		this.item = item;
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
