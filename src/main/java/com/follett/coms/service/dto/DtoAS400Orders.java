package com.follett.coms.service.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author amahajan
 *
 */
public class DtoAS400Orders {

	private DtoAS400OrdersId id;

	private DtoAS400Customers customers;

	private Integer orderId;

	private Long masterOrderNumber;

	private Integer quoteNumber;

	private String customerName;

	private BigDecimal poNumber;

	private String orderStatus;

	private String orderType;

	private String orderProcessStatus;

	private String orderCategory;

	private String orderSource;

	private String pullSheetNumber;

	private Date orderDate;

	private String taxEmempt;

	private String taxEmemptNum;

	private Set<DtoAS400TrackingInformation> trackingInfo;

	private Set<DtoAS400BillShipInformation> billShipInfo;

	private List<DtoAS400Items> itemInfo;

	/**
	 * @return the itemInfo
	 */
	public List<DtoAS400Items> getItemInfo() {
		return itemInfo;
	}

	/**
	 * @param itemInfo
	 *            the itemInfo to set
	 */
	public void setItemInfo(List<DtoAS400Items> itemInfo) {
		this.itemInfo = itemInfo;
	}

	/**
	 * @return the billShipInfo
	 */
	public Set<DtoAS400BillShipInformation> getBillShipInfo() {
		return billShipInfo;
	}

	/**
	 * @param billShipInfo
	 *            the billShipInfo to set
	 */
	public void setBillShipInfo(Set<DtoAS400BillShipInformation> billShipInfo) {
		this.billShipInfo = billShipInfo;
	}

	/**
	 * @return the id
	 */
	public DtoAS400OrdersId getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(DtoAS400OrdersId id) {
		this.id = id;
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
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the masterOrderNumber
	 */
	public Long getMasterOrderNumber() {
		return masterOrderNumber;
	}

	/**
	 * @param masterOrderNumber
	 *            the masterOrderNumber to set
	 */
	public void setMasterOrderNumber(Long masterOrderNumber) {
		this.masterOrderNumber = masterOrderNumber;
	}

	/**
	 * @return the quoteNumber
	 */
	public Integer getQuoteNumber() {
		return quoteNumber;
	}

	/**
	 * @param quoteNumber
	 *            the quoteNumber to set
	 */
	public void setQuoteNumber(Integer quoteNumber) {
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
	public BigDecimal getPoNumber() {
		return poNumber;
	}

	/**
	 * @param poNumber
	 *            the poNumber to set
	 */
	public void setPoNumber(BigDecimal poNumber) {
		this.poNumber = poNumber;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType
	 *            the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the orderProcessStatus
	 */
	public String getOrderProcessStatus() {
		return orderProcessStatus;
	}

	/**
	 * @param orderProcessStatus
	 *            the orderProcessStatus to set
	 */
	public void setOrderProcessStatus(String orderProcessStatus) {
		this.orderProcessStatus = orderProcessStatus;
	}

	/**
	 * @return the orderCategory
	 */
	public String getOrderCategory() {
		return orderCategory;
	}

	/**
	 * @param orderCategory
	 *            the orderCategory to set
	 */
	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}

	/**
	 * @return the orderSource
	 */
	public String getOrderSource() {
		return orderSource;
	}

	/**
	 * @param orderSource
	 *            the orderSource to set
	 */
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	/**
	 * @return the pullSheetNumber
	 */
	public String getPullSheetNumber() {
		return pullSheetNumber;
	}

	/**
	 * @param pullSheetNumber
	 *            the pullSheetNumber to set
	 */
	public void setPullSheetNumber(String pullSheetNumber) {
		this.pullSheetNumber = pullSheetNumber;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate
	 *            the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the taxEmempt
	 */
	public String getTaxEmempt() {
		return taxEmempt;
	}

	/**
	 * @param taxEmempt
	 *            the taxEmempt to set
	 */
	public void setTaxEmempt(String taxEmempt) {
		this.taxEmempt = taxEmempt;
	}

	/**
	 * @return the taxEmemptNum
	 */
	public String getTaxEmemptNum() {
		return taxEmemptNum;
	}

	/**
	 * @param taxEmemptNum
	 *            the taxEmemptNum to set
	 */
	public void setTaxEmemptNum(String taxEmemptNum) {
		this.taxEmemptNum = taxEmemptNum;
	}

	/**
	 * @return the trackingInfo
	 */
	public Set<DtoAS400TrackingInformation> getTrackingInfo() {
		return trackingInfo;
	}

	/**
	 * @param trackingInfo
	 *            the trackingInfo to set
	 */
	public void setTrackingInfo(Set<DtoAS400TrackingInformation> trackingInfo) {
		this.trackingInfo = trackingInfo;
	}

}
