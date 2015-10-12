package com.follett.coms.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.jws.WebService;

import com.follett.coms.service.dto.DtoAS400BillShipInformation;
import com.follett.coms.service.dto.DtoAS400ContactInformation;
import com.follett.coms.service.dto.DtoAS400Customers;
import com.follett.coms.service.dto.DtoAS400Items;
import com.follett.coms.service.dto.DtoAS400Orders;
import com.follett.coms.service.dto.DtoAS400OrdersId;
import com.follett.coms.service.dto.DtoAS400ProfileInformation;
import com.follett.coms.service.dto.DtoAS400TrackingInformation;
import com.follett.coms.service.models.As400BillShipInformation;
import com.follett.coms.service.models.As400ContactInformation;
import com.follett.coms.service.models.As400Customers;
import com.follett.coms.service.models.As400Items;
import com.follett.coms.service.models.As400Orders;
import com.follett.coms.service.models.As400ProfileInformation;
import com.follett.coms.service.models.As400TrackingInformation;
import com.follett.coms.service.models.Orderitemsview;
import com.follett.coms.service.ws.AS400Search;
import com.follett.coms.service.ws.jaxws.GetAS400CustomersSearchResponse;
import com.follett.coms.service.ws.jaxws.GetAS400ItemsSearchResponse;
import com.follett.coms.service.ws.jaxws.GetAS400OrderSearchResponse;

/**
 * @author amahajan
 *
 */
@WebService(endpointInterface = "com.follett.coms.service.ws.AS400Search")
public class AS400SearchImpl implements AS400Search {

	private AS400HibernateImpl hibernateImpl = new AS400HibernateImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.follett.coms.service.ws.AS400Search#getAS400CustomersByCriteria(long,
	 * java.lang.String, java.lang.String, java.lang.String, long,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	public List<GetAS400CustomersSearchResponse> getAS400CustomersByCriteria(
			long customerNumber, String customerName,
			String mdrPermanentIdNumber, String addressLineOne,
			long phoneNumber, String city, String state, String postalCode,
			String nation, String contactName) {
		GetAS400CustomersSearchResponse response = new GetAS400CustomersSearchResponse();
		List<GetAS400CustomersSearchResponse> responseList = new ArrayList<GetAS400CustomersSearchResponse>();
		List<As400Customers> customerList = hibernateImpl
				.getAS400CustomersByCriteria(customerNumber, customerName,
						mdrPermanentIdNumber, addressLineOne, phoneNumber,
						city, state, postalCode, nation, contactName);
		for (As400Customers as400Customers : customerList) {
			DtoAS400Customers dtoResponse = new DtoAS400Customers();
			// customer attributes
			dtoResponse.setAddressLineOne(as400Customers.getAddressLine1());
			dtoResponse.setCity(as400Customers.getCity());
			dtoResponse.setContactName(as400Customers.getCustomerName());
			dtoResponse.setCustomerNumber(as400Customers.getCustomerNumber());
			dtoResponse.setMdrPermanentIdNumber(as400Customers.getMdrPid());
			dtoResponse.setNation(as400Customers.getNation());
			dtoResponse.setPhoneExt(as400Customers.getPhoneExt());
			dtoResponse.setPhoneNumber(as400Customers.getPhoneNumber());
			dtoResponse.setPostalCode(as400Customers.getPostalCode());
			dtoResponse.setState(as400Customers.getState());
			// setting relational mappings
			// fetching and assigning BillShipInformation attributes
			Set<DtoAS400BillShipInformation> billShipInfo = new HashSet<DtoAS400BillShipInformation>();
			Set<As400BillShipInformation> as400BillShipInformations = as400Customers
					.getAs400BillShipInformations();
			for (As400BillShipInformation as400BillShipInfo : as400BillShipInformations) {
				DtoAS400BillShipInformation dtoShipInfo = new DtoAS400BillShipInformation();
				dtoShipInfo.setAddress1(as400BillShipInfo.getAddress1());
				dtoShipInfo.setAddress2(as400BillShipInfo.getAddress2());
				dtoShipInfo.setAttention(as400BillShipInfo.getAttention());
				dtoShipInfo.setBillShipId(as400BillShipInfo.getBillShipId());
				dtoShipInfo
						.setBillShipType(as400BillShipInfo.getBillShipType());
				dtoShipInfo.setCity(as400BillShipInfo.getCity());

				dtoShipInfo
						.setCustomerName(as400BillShipInfo.getCustomerName());
				dtoShipInfo.setPostalCode(as400BillShipInfo.getPostalCode());
				dtoShipInfo.setState(as400BillShipInfo.getState());

				// fetching and assigning ContactInformation attributes
				Set<DtoAS400ContactInformation> contactInfo = new HashSet<DtoAS400ContactInformation>();
				// getting contact information linked to BillShipInformation
				Set<As400ContactInformation> as400ContactInformations = as400BillShipInfo
						.getAs400ContactInformations();
				for (As400ContactInformation as400ContactInfo : as400ContactInformations) {
					DtoAS400ContactInformation dtoContactInfo = new DtoAS400ContactInformation();
					dtoContactInfo
							.setContactId(as400ContactInfo.getContactId());
					dtoContactInfo.setContactName(as400ContactInfo
							.getContactName());
					dtoContactInfo.setOrderNumber(as400ContactInfo
							.getOrderNumber());
					dtoContactInfo.setOrderSuffix(as400ContactInfo
							.getOrderSuffix());
					contactInfo.add(dtoContactInfo);
				}
				dtoShipInfo.setContactInfo(contactInfo);
				billShipInfo.add(dtoShipInfo);
			}
			dtoResponse.setBillShipInfo(billShipInfo);

			// fetching and assigning ProfileInformation attributes
			Set<DtoAS400ProfileInformation> profileInfo = new HashSet<DtoAS400ProfileInformation>();
			Set<As400ProfileInformation> as400ProfileInformations = as400Customers
					.getAs400ProfileInformations();
			for (As400ProfileInformation as400ProfileInfo : as400ProfileInformations) {
				DtoAS400ProfileInformation dtoProfileInfo = new DtoAS400ProfileInformation();
				dtoProfileInfo.setClassOfTrade(as400ProfileInfo
						.getClassOfTrade());
				// profileInformation.setCustomers(customers);
				dtoProfileInfo.setProfileId(as400ProfileInfo.getProfileId());
				profileInfo.add(dtoProfileInfo);
			}
			dtoResponse.setProfileInfo(profileInfo);
			response.setCustomers(dtoResponse);
			responseList.add(response);
		}
		return responseList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.follett.coms.service.ws.AS400Search#getAS400ItemsByCriteria(long,
	 * java.lang.String, java.lang.String, long, long, java.lang.String, long)
	 */
	public List<GetAS400ItemsSearchResponse> getAS400ItemsByCriteria(
			String bookNumber, String title, String author, long copyrightYear,
			long vendorNumber, String publisherCode, long vendorProductNumber) {
		GetAS400ItemsSearchResponse response = new GetAS400ItemsSearchResponse();
		List<GetAS400ItemsSearchResponse> responseList = new ArrayList<GetAS400ItemsSearchResponse>();
		// getting result list from database by criteria.
		List<As400Items> itemList = hibernateImpl.getAS400ItemsByCriteria(
				bookNumber, title, author, copyrightYear, vendorNumber,
				publisherCode, vendorProductNumber);
		for (As400Items as400Items : itemList) {
			DtoAS400Items dtoItem = new DtoAS400Items();
			dtoItem.setAuthor(as400Items.getAuthor());
			dtoItem.setBookNotes(as400Items.getBookNotes());
			dtoItem.setBookNumber(as400Items.getBookNumber());
			dtoItem.setBookType(as400Items.getBookType());
			dtoItem.setCopyrightYear(as400Items.getCopyrightYear());
			dtoItem.setEdition(as400Items.getEdition());
			dtoItem.setFesBookNumber(as400Items.getFesBookNumber());
			dtoItem.setIsbn(as400Items.getIsbn());
			dtoItem.setItemDescription(as400Items.getItemDescription());
			dtoItem.setProductCategory(as400Items.getProductCategory());
			dtoItem.setPublisher(as400Items.getPublisher());
			dtoItem.setPublisherCode(as400Items.getPublisherCode());
			dtoItem.setPublisherItemNum(as400Items.getPublisherItemNum());
			dtoItem.setReadingLevel(as400Items.getReadingLevel());
			dtoItem.setSubject(as400Items.getSubject());
			dtoItem.setTitle(as400Items.getTitle());
			dtoItem.setTitleInformation(as400Items.getTitleInformation());
			dtoItem.setUpcCode(as400Items.getUpcCode());
			dtoItem.setVendorNumber(as400Items.getVendorNumber());
			dtoItem.setVendorProductNumber(as400Items.getVendorProductNumber());
			dtoItem.setWarehouseCode(as400Items.getWarehouseCode());
			dtoItem.setWaveAccRedIntLvl(as400Items.getWaveAccRedIntLvl());
			response.setItem(dtoItem);
			responseList.add(response);
		}
		return responseList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.follett.coms.service.ws.AS400Search#getAS400OrdersByCriteria(long,
	 * java.lang.String, long, long, java.lang.String, long, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * long)
	 */
	public List<GetAS400OrderSearchResponse> getAS400OrdersByCriteria(
			long orderNumber, String orderSuffix, long customerNumber,
			long quoteNumber, String customerName, long poNumber, String city,
			String state, String zip, String nation, String orderStatus,
			long orderId) {
		GetAS400OrderSearchResponse response = new GetAS400OrderSearchResponse();
		List<GetAS400OrderSearchResponse> responseList = new ArrayList<GetAS400OrderSearchResponse>();
		// getting result list from database by criteria.
		List<As400Orders> orderList = hibernateImpl.getAS400OrdersByCriteria(
				orderNumber, orderSuffix, customerNumber, quoteNumber,
				customerName, poNumber, city, state, zip, nation, orderStatus,
				orderId);
		for (As400Orders as400Orders : orderList) {
			DtoAS400Orders dtoOrder = new DtoAS400Orders();
			dtoOrder.setCustomerName(as400Orders.getCustomerName());

			dtoOrder.setMasterOrderNumber(as400Orders.getMasterOrderNumber());
			dtoOrder.setOrderCategory(as400Orders.getOrderCategory());
			dtoOrder.setOrderDate(as400Orders.getOrderDate());
			dtoOrder.setOrderId(as400Orders.getOrderId());
			dtoOrder.setOrderProcessStatus(as400Orders.getOrderProcessStatus());
			dtoOrder.setOrderSource(as400Orders.getOrderSource());
			dtoOrder.setOrderStatus(as400Orders.getOrderStatus());
			dtoOrder.setOrderType(as400Orders.getOrderType());
			dtoOrder.setPoNumber(as400Orders.getPoNumber());
			dtoOrder.setPullSheetNumber(as400Orders.getPullSheetNumber());
			// ######################################################
			// dtoOrder.setQuoteNumber(as400Orders.getQuoteNumber());
			dtoOrder.setTaxEmempt(as400Orders.getTaxEmempt());
			dtoOrder.setTaxEmemptNum(as400Orders.getTaxEmemptNum());
			// setting attributes to AS400OrderId dto
			DtoAS400OrdersId id = new DtoAS400OrdersId();
			id.setOrderNumber(as400Orders.getId().getOrderNumber());
			id.setOrderSuffix(as400Orders.getId().getOrderSuffix());
			dtoOrder.setId(id);

			// fetching and assigning BillShipInformation attributes
			Set<DtoAS400BillShipInformation> billShipInfo = new HashSet<DtoAS400BillShipInformation>();
			Set<As400BillShipInformation> as400BillShipInformations = as400Orders
					.getAs400BillShipInformations();
			for (As400BillShipInformation as400BillShipInfo : as400BillShipInformations) {
				DtoAS400BillShipInformation dtoShipInfo = new DtoAS400BillShipInformation();
				dtoShipInfo.setAddress1(as400BillShipInfo.getAddress1());
				dtoShipInfo.setAddress2(as400BillShipInfo.getAddress2());
				dtoShipInfo.setAttention(as400BillShipInfo.getAttention());
				dtoShipInfo.setBillShipId(as400BillShipInfo.getBillShipId());
				dtoShipInfo
						.setBillShipType(as400BillShipInfo.getBillShipType());
				dtoShipInfo.setCity(as400BillShipInfo.getCity());
				dtoShipInfo
						.setCustomerName(as400BillShipInfo.getCustomerName());
				dtoShipInfo.setPostalCode(as400BillShipInfo.getPostalCode());
				dtoShipInfo.setState(as400BillShipInfo.getState());

				// fetching and assigning ContactInformation attributes of
				// BILLSHIPINFORMATION
				Set<DtoAS400ContactInformation> contactInfo = new HashSet<DtoAS400ContactInformation>();
				Set<As400ContactInformation> as400ContactInformations = as400BillShipInfo
						.getAs400ContactInformations();
				for (As400ContactInformation as400ContactInfo : as400ContactInformations) {
					DtoAS400ContactInformation dtoContactInfo = new DtoAS400ContactInformation();
					dtoContactInfo
							.setContactId(as400ContactInfo.getContactId());
					dtoContactInfo.setContactName(as400ContactInfo
							.getContactName());
					dtoContactInfo.setOrderNumber(as400ContactInfo
							.getOrderNumber());
					dtoContactInfo.setOrderSuffix(as400ContactInfo
							.getOrderSuffix());
					contactInfo.add(dtoContactInfo);
				}

				dtoShipInfo.setContactInfo(contactInfo);
				billShipInfo.add(dtoShipInfo);
			}
			dtoOrder.setBillShipInfo(billShipInfo);

			// fetching and assigning TrackingInformation attributes
			Set<DtoAS400TrackingInformation> trackingInfo = new HashSet<DtoAS400TrackingInformation>();
			Set<As400TrackingInformation> as400TrackingInformation = as400Orders
					.getAs400TrackingInformations();
			for (As400TrackingInformation as400TrackingInfo : as400TrackingInformation) {
				DtoAS400TrackingInformation dtoTrackingInfo = new DtoAS400TrackingInformation();
				dtoTrackingInfo.setInvoiceBatchNumber(as400TrackingInfo
						.getInvoiceBatchNumber());

				dtoTrackingInfo.setInvoiceDate(as400TrackingInfo
						.getInvoiceDate());
				dtoTrackingInfo.setShipmentMethod(as400TrackingInfo
						.getShipmentMethod());
				dtoTrackingInfo.setShipOrderOnDate(as400TrackingInfo
						.getShipOrderOnDate());
				dtoTrackingInfo.setShippedDate(as400TrackingInfo
						.getShippedDate());
				dtoTrackingInfo.setTotalInvoice(as400TrackingInfo
						.getTotalInvoice());
				dtoTrackingInfo
						.setTrackingId(as400TrackingInfo.getTrackingId());
				trackingInfo.add(dtoTrackingInfo);
			}
			dtoOrder.setTrackingInfo(trackingInfo);

			// getting all the items liked to the particular order.
			List<Orderitemsview> itemList = as400Orders.getAs400Items();
			List<DtoAS400Items> dtoItemsList = new ArrayList<DtoAS400Items>();
			for (Orderitemsview as400Items : itemList) {
				DtoAS400Items dtoItem = new DtoAS400Items();
				dtoItem.setAuthor(as400Items.getAuthor());
				dtoItem.setBookNotes(as400Items.getBookNotes());
				dtoItem.setBookNumber(as400Items.getBookNumber());
				dtoItem.setBookType(as400Items.getBookType());
				dtoItem.setCopyrightYear(as400Items.getCopyrightYear());
				dtoItem.setEdition(as400Items.getEdition());
				dtoItem.setFesBookNumber(as400Items.getFesBookNumber());
				dtoItem.setIsbn(as400Items.getIsbn());
				dtoItem.setItemDescription(as400Items.getItemDescription());
				dtoItem.setProductCategory(as400Items.getProductCategory());
				dtoItem.setPublisher(as400Items.getPublisher());
				dtoItem.setPublisherCode(as400Items.getPublisherCode());
				dtoItem.setPublisherItemNum(as400Items.getPublisherItemNum());
				dtoItem.setReadingLevel(as400Items.getReadingLevel());
				dtoItem.setSubject(as400Items.getSubject());
				dtoItem.setTitle(as400Items.getTitle());
				dtoItem.setTitleInformation(as400Items.getTitleInformation());
				dtoItem.setUpcCode(as400Items.getUpcCode());
				dtoItem.setVendorNumber(as400Items.getVendorNumber());
				dtoItem.setVendorProductNumber(as400Items
						.getVendorProductNumber());
				dtoItem.setWarehouseCode(as400Items.getWarehouseCode());
				dtoItem.setWaveAccRedIntLvl(as400Items.getWaveAccRedIntLvl());
				dtoItemsList.add(dtoItem);
			}
			dtoOrder.setItemInfo(dtoItemsList);
			response.setOrder(dtoOrder);
			// setting all the information to a list
			responseList.add(response);
		}
		return responseList;
	}
}
