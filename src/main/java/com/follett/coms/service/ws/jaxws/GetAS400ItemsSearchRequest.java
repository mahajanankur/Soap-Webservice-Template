package com.follett.coms.service.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author amahajan
 *
 */
@XmlRootElement(name = "getAS400ItemsSearchRequest", namespace = "http://ws.follett.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAS400ItemsSearchRequest", namespace = "http://ws.follett.com/")
public class GetAS400ItemsSearchRequest {

	@XmlElement(name = "bookNumber", required = false, type = Long.class)
	private long bookNumber;

	@XmlElement(name = "title", required = false, type = String.class)
	private String title;

	@XmlElement(name = "author", required = false, type = String.class)
	private String author;

	@XmlElement(name = "copyrightYear", required = false, type = Long.class)
	private long copyrightYear;

	@XmlElement(name = "vendorNumber", required = false, type = Long.class)
	private long vendorNumber;

	@XmlElement(name = "publisherCode", required = false, type = String.class)
	private String publisherCode;

	@XmlElement(name = "vendorProductNumber", required = false, type = Long.class)
	private long vendorProductNumber;

	/**
	 * @return the bookNumber
	 */
	public long getBookNumber() {
		return bookNumber;
	}

	/**
	 * @param bookNumber
	 *            the bookNumber to set
	 */
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the copyrightYear
	 */
	public long getCopyrightYear() {
		return copyrightYear;
	}

	/**
	 * @param copyrightYear
	 *            the copyrightYear to set
	 */
	public void setCopyrightYear(long copyrightYear) {
		this.copyrightYear = copyrightYear;
	}

	/**
	 * @return the vendorNumber
	 */
	public long getVendorNumber() {
		return vendorNumber;
	}

	/**
	 * @param vendorNumber
	 *            the vendorNumber to set
	 */
	public void setVendorNumber(long vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	/**
	 * @return the publisherCode
	 */
	public String getPublisherCode() {
		return publisherCode;
	}

	/**
	 * @param publisherCode
	 *            the publisherCode to set
	 */
	public void setPublisherCode(String publisherCode) {
		this.publisherCode = publisherCode;
	}

	/**
	 * @return the vendorProductNumber
	 */
	public long getVendorProductNumber() {
		return vendorProductNumber;
	}

	/**
	 * @param vendorProductNumber
	 *            the vendorProductNumber to set
	 */
	public void setVendorProductNumber(long vendorProductNumber) {
		this.vendorProductNumber = vendorProductNumber;
	}

}
