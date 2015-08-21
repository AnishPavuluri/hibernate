package mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerNo;
	private String customerName;
	private Set travelerses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer customerNo) {
		this.customerNo = customerNo;
	}

	/** full constructor */
	public Customer(Integer customerNo, String customerName, Set travelerses) {
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.travelerses = travelerses;
	}

	// Property accessors

	public Integer getCustomerNo() {
		return this.customerNo;
	}

	public void setCustomerNo(Integer customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set getTravelerses() {
		return this.travelerses;
	}

	public void setTravelerses(Set travelerses) {
		this.travelerses = travelerses;
	}

}