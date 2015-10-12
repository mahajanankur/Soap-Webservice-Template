package com.follett.coms.service.dto;

import java.math.BigDecimal;

/**
 * @author amahajan
 *
 */
public class DtoAS400ProfileInformation {

	private BigDecimal profileId;

	private DtoAS400Customers customers;

	private String classOfTrade;

	/**
	 * @return the profileId
	 */
	public BigDecimal getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId
	 *            the profileId to set
	 */
	public void setProfileId(BigDecimal profileId) {
		this.profileId = profileId;
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
	 * @return the classOfTrade
	 */
	public String getClassOfTrade() {
		return classOfTrade;
	}

	/**
	 * @param classOfTrade
	 *            the classOfTrade to set
	 */
	public void setClassOfTrade(String classOfTrade) {
		this.classOfTrade = classOfTrade;
	}

}
