package com.follett.coms.service.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author amahajan
 *
 */
public class DtoAS400TrackingInformation {

	private BigDecimal trackingId;

	private DtoAS400Orders orders;

	private String shipmentMethod;

	private Date shippedDate;

	private Date invoiceDate;

	private Long totalInvoice;

	private String invoiceBatchNumber;

	private Date shipOrderOnDate;

	/**
	 * @return the trackingId
	 */
	public BigDecimal getTrackingId() {
		return trackingId;
	}

	/**
	 * @param trackingId
	 *            the trackingId to set
	 */
	public void setTrackingId(BigDecimal trackingId) {
		this.trackingId = trackingId;
	}

	/**
	 * @return the orders
	 */
	public DtoAS400Orders getOrders() {
		return orders;
	}

	/**
	 * @param orders
	 *            the orders to set
	 */
	public void setOrders(DtoAS400Orders orders) {
		this.orders = orders;
	}

	/**
	 * @return the shipmentMethod
	 */
	public String getShipmentMethod() {
		return shipmentMethod;
	}

	/**
	 * @param shipmentMethod
	 *            the shipmentMethod to set
	 */
	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	/**
	 * @return the shippedDate
	 */
	public Date getShippedDate() {
		return shippedDate;
	}

	/**
	 * @param shippedDate
	 *            the shippedDate to set
	 */
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	/**
	 * @return the invoiceDate
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate
	 *            the invoiceDate to set
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the totalInvoice
	 */
	public Long getTotalInvoice() {
		return totalInvoice;
	}

	/**
	 * @param totalInvoice
	 *            the totalInvoice to set
	 */
	public void setTotalInvoice(Long totalInvoice) {
		this.totalInvoice = totalInvoice;
	}

	/**
	 * @return the invoiceBatchNumber
	 */
	public String getInvoiceBatchNumber() {
		return invoiceBatchNumber;
	}

	/**
	 * @param invoiceBatchNumber
	 *            the invoiceBatchNumber to set
	 */
	public void setInvoiceBatchNumber(String invoiceBatchNumber) {
		this.invoiceBatchNumber = invoiceBatchNumber;
	}

	/**
	 * @return the shipOrderOnDate
	 */
	public Date getShipOrderOnDate() {
		return shipOrderOnDate;
	}

	/**
	 * @param shipOrderOnDate
	 *            the shipOrderOnDate to set
	 */
	public void setShipOrderOnDate(Date shipOrderOnDate) {
		this.shipOrderOnDate = shipOrderOnDate;
	}

}
