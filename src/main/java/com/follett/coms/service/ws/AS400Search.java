package com.follett.coms.service.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.follett.coms.service.ws.jaxws.GetAS400CustomersSearchResponse;
import com.follett.coms.service.ws.jaxws.GetAS400ItemsSearchResponse;
import com.follett.coms.service.ws.jaxws.GetAS400OrderSearchResponse;

/**
 * @author amahajan
 *
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface AS400Search {

	@WebMethod
	List<GetAS400CustomersSearchResponse> getAS400CustomersByCriteria(
			@WebParam(name = "customerNumber") long customerNumber,
			@WebParam(name = "customerName") String customerName,
			@WebParam(name = "mdrPermanentIdNumber") String mdrPermanentIdNumber,
			@WebParam(name = "addressLineOne") String addressLineOne,
			@WebParam(name = "phoneNumber") long phoneNumber,
			@WebParam(name = "city") String city,
			@WebParam(name = "state") String state,
			@WebParam(name = "postalCode") String postalCode,
			@WebParam(name = "nation") String nation,
			@WebParam(name = "contactName") String contactName);

	@WebMethod
	List<GetAS400ItemsSearchResponse> getAS400ItemsByCriteria(
			@WebParam(name = "bookNumber") String bookNumber,
			@WebParam(name = "title") String title,
			@WebParam(name = "author") String author,
			@WebParam(name = "copyrightYear") long copyrightYear,
			@WebParam(name = "vendorNumber") long vendorNumber,
			@WebParam(name = "publisherCode") String publisherCode,
			@WebParam(name = "vendorProductNumber") long vendorProductNumber);

	@WebMethod
	List<GetAS400OrderSearchResponse> getAS400OrdersByCriteria(
			@WebParam(name = "orderNumber") long orderNumber,
			@WebParam(name = "orderSuffix") String orderSuffix,
			@WebParam(name = "customerNumber") long customerNumber,
			@WebParam(name = "quoteNumber") long quoteNumber,
			@WebParam(name = "customerName") String customerName,
			@WebParam(name = "poNumber") long poNumber,
			@WebParam(name = "city") String city,
			@WebParam(name = "state") String state,
			@WebParam(name = "zip") String zip,
			@WebParam(name = "nation") String nation,
			@WebParam(name = "orderStatus") String orderStatus,
			@WebParam(name = "orderId") long orderId);
}
