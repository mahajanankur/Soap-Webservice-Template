package com.follett.coms.service.dto;

import java.util.Set;

/**
 * @author amahajan
 *
 */
public class DtoAS400Customers {

	private long customerNumber;

	private String customerName;

	private String addressLineOne;

	private String city;

	private String state;

	private String nation;

	private String postalCode;

	private String contactName;

	private String phoneNumber;

	private long phoneExt;

	private String mdrPermanentIdNumber;

	// mapping attributes
	private Set<DtoAS400BillShipInformation> billShipInfo;

	private Set<DtoAS400ProfileInformation> profileInfo;

	private Set<DtoAS400ContactInformation> contactInfo;

	private Set<DtoAS400Orders> orders;

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
	 * @return the addressLineOne
	 */
	public String getAddressLineOne() {
		return addressLineOne;
	}

	/**
	 * @param addressLineOne
	 *            the addressLineOne to set
	 */
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
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
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the phoneExt
	 */
	public long getPhoneExt() {
		return phoneExt;
	}

	/**
	 * @param phoneExt
	 *            the phoneExt to set
	 */
	public void setPhoneExt(long phoneExt) {
		this.phoneExt = phoneExt;
	}

	/**
	 * @return the mdrPermanentIdNumber
	 */
	public String getMdrPermanentIdNumber() {
		return mdrPermanentIdNumber;
	}

	/**
	 * @param mdrPermanentIdNumber
	 *            the mdrPermanentIdNumber to set
	 */
	public void setMdrPermanentIdNumber(String mdrPermanentIdNumber) {
		this.mdrPermanentIdNumber = mdrPermanentIdNumber;
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
	 * @return the profileInfo
	 */
	public Set<DtoAS400ProfileInformation> getProfileInfo() {
		return profileInfo;
	}

	/**
	 * @param profileInfo
	 *            the profileInfo to set
	 */
	public void setProfileInfo(Set<DtoAS400ProfileInformation> profileInfo) {
		this.profileInfo = profileInfo;
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

	/**
	 * @return the orders
	 */
	public Set<DtoAS400Orders> getOrders() {
		return orders;
	}

	/**
	 * @param orders
	 *            the orders to set
	 */
	public void setOrders(Set<DtoAS400Orders> orders) {
		this.orders = orders;
	}

}
