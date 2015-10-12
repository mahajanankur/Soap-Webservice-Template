package com.follett.coms.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.follett.coms.service.models.As400Customers;
import com.follett.coms.service.models.As400Items;
import com.follett.coms.service.models.As400Orders;

/**
 * @author amahajan
 *
 */
public class AS400HibernateImpl {

	private String PERSISTENCE_UNIT_NAME = "as400";

	private EntityManagerFactory emfactory = Persistence
			.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	public AS400HibernateImpl(String pERSISTENCE_UNIT_NAME,
			EntityManagerFactory emfactory, EntityManager em) {
		super();
		PERSISTENCE_UNIT_NAME = pERSISTENCE_UNIT_NAME;
		this.emfactory = emfactory;
	}

	public AS400HibernateImpl() {
	}

	/**
	 * This method is used to search the items based on the criteria passed.
	 * 
	 * @param bookNumber
	 * @param title
	 * @param author
	 * @param copyrightYear
	 * @param vendorNumber
	 * @param publisherCode
	 * @param vendorProductNumber
	 * @return itemsList
	 */
	public List<As400Items> getAS400ItemsByCriteria(String bookNumber,
			String title, String author, long copyrightYear, long vendorNumber,
			String publisherCode, long vendorProductNumber) {

		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		// using Predicate functionality of JPA
		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery cq = qb.createQuery();
		Root<As400Items> item = cq.from(As400Items.class);

		// Constructing list of Predicate
		List<Predicate> predicates = new ArrayList<Predicate>();

		// Adding predicates in case of parameter not being null
		if (bookNumber != null) {
			predicates.add(qb.equal(item.get("bookNumber"), bookNumber));
		}
		if (title != null) {
			predicates.add(qb.equal(item.get("title"), title));
		}
		if (author != null) {
			predicates.add(qb.equal(item.get("author"), author));
		}
		if (copyrightYear != 0) {
			predicates.add(qb.equal(item.get("copyrightYear"), copyrightYear));
		}
		if (vendorNumber != 0) {
			predicates.add(qb.equal(item.get("vendorNumber"), vendorNumber));
		}
		if (publisherCode != null) {
			predicates.add(qb.equal(item.get("publisherCode"), publisherCode));
		}
		if (vendorProductNumber != 0) {
			predicates.add(qb.equal(item.get("vendorProductNumber"),
					vendorProductNumber));
		}
		// formation of query.
		cq.select(item).where(predicates.toArray(new Predicate[] {}));
		// to get the item list by executing query.
		List<As400Items> itemList = em.createQuery(cq).getResultList();
		em.close();
		return itemList;
	}

	/**
	 * This method is used to search the customers based on the criteria passed.
	 * 
	 * @param customerNumber
	 * @param customerName
	 * @param mdrPermanentIdNumber
	 * @param addressLineOne
	 * @param phoneNumber
	 * @param city
	 * @param state
	 * @param postalCode
	 * @param nation
	 * @param contactName
	 * @return customerList
	 */
	public List<As400Customers> getAS400CustomersByCriteria(
			long customerNumber, String customerName,
			String mdrPermanentIdNumber, String addressLineOne,
			long phoneNumber, String city, String state, String postalCode,
			String nation, String contactName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		// using Predicate functionality of JPA
		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery cq = qb.createQuery();
		Root<As400Customers> customer = cq.from(As400Customers.class);

		// Constructing list of Predicate
		List<Predicate> predicates = new ArrayList<Predicate>();

		// Adding predicates in case of parameter not being null
		if (customerNumber != 0) {
			predicates.add(qb.equal(customer.get("customerNumber"),
					customerNumber));
		}
		if (customerName != null) {
			predicates
					.add(qb.equal(customer.get("customerName"), customerName));
		}
		if (mdrPermanentIdNumber != null) {
			predicates.add(qb.equal(customer.get("mdrPid"),
					mdrPermanentIdNumber));
		}
		if (addressLineOne != null) {
			predicates.add(qb.equal(customer.get("addressLine1"),
					addressLineOne));
		}
		if (phoneNumber != 0) {
			predicates.add(qb.equal(customer.get("phoneNumber"), phoneNumber));
		}
		if (city != null) {
			predicates.add(qb.equal(customer.get("city"), city));
		}
		if (state != null) {
			predicates.add(qb.equal(customer.get("state"), state));
		}
		if (postalCode != null) {
			predicates.add(qb.equal(customer.get("postalCode"), postalCode));
		}
		if (nation != null) {
			predicates.add(qb.equal(customer.get("nation"), nation));
		}
		// if (contactName != null) {
		// predicates.add(qb.equal(item.get("contactName"), contactName));
		// }
		// formation of query.
		cq.select(customer).where(predicates.toArray(new Predicate[] {}));
		// to get the item list by executing query.
		List<As400Customers> customerList = em.createQuery(cq).getResultList();
		em.close();
		return customerList;
	}

	/**
	 * This method is used to search the orders based on the criteria passed.
	 * 
	 * @param orderNumber
	 * @param orderSuffix
	 * @param customerNumber
	 * @param quoteNumber
	 * @param customerName
	 * @param poNumber
	 * @param city
	 * @param state
	 * @param zip
	 * @param nation
	 * @param orderStatus
	 * @param orderId
	 * @return orderList
	 */
	public List<As400Orders> getAS400OrdersByCriteria(long orderNumber,
			String orderSuffix, long customerNumber, long quoteNumber,
			String customerName, long poNumber, String city, String state,
			String zip, String nation, String orderStatus, long orderId) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		// using Predicate functionality of JPA
		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery cq = qb.createQuery();
		Root<As400Orders> order = cq.from(As400Orders.class);

		// Constructing list of Predicate
		List<Predicate> predicates = new ArrayList<Predicate>();

		// Adding predicates in case of parameter not being null
		if (orderNumber != 0) {
			predicates.add(qb.equal(order.get("id").get("orderNumber"),
					orderNumber));
		}

		if (orderSuffix != null) {
			predicates.add(qb.equal(order.get("id").get("orderSuffix"),
					orderSuffix));
		}
		if (customerNumber != 0) {
			predicates.add(qb.equal(
					order.get("as400Customers").get("customerNumber"),
					customerNumber));
		}
		if (quoteNumber != 0) {
			predicates.add(qb.equal(order.get("quoteNumber"), quoteNumber));
		}
		if (customerName != null) {
			predicates.add(qb.equal(order.get("customerName"), customerName));
		}
		if (poNumber != 0) {
			predicates.add(qb.equal(order.get("poNumber"), poNumber));
		}
		if (city != null) {
			predicates.add(qb.equal(order.get("city"), city));
		}
		if (state != null) {
			predicates.add(qb.equal(order.get("state"), state));
		}
		if (zip != null) {
			predicates.add(qb.equal(
					order.get("as400Customers").get("postalCode"), zip));
		}
		if (nation != null) {
			predicates.add(qb.equal(order.get("nation"), nation));
		}
		if (orderStatus != null) {
			predicates.add(qb.equal(order.get("orderStatus"), orderStatus));
		}
		if (orderId != 0) {
			predicates.add(qb.equal(order.get("orderId"), orderId));
		}
		// formation of query.
		cq.select(order).where(predicates.toArray(new Predicate[] {}));
		// to get the item list by executing query.
		List<As400Orders> orderList = em.createQuery(cq).getResultList();
		em.close();
		return orderList;
	}

}
