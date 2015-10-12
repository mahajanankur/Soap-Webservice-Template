package com.follett.coms.service.dto;

/**
 * @author amahajan
 * 
 *         This dto is used to get order entity's embeddable primary keys info.
 *         Similar to As400OrdersId model.
 *
 */
public class DtoAS400OrdersId {

	private int orderNumber;

	private String orderSuffix;

	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
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
