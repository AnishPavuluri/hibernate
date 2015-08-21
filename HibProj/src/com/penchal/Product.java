package com.penchal;

import java.math.BigDecimal;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private BigDecimal pid;
	private String pname;
	private Double price;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(BigDecimal pid) {
		this.pid = pid;
	}

	/** full constructor */
	public Product(BigDecimal pid, String pname, Double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	// Property accessors

	public BigDecimal getPid() {
		return this.pid;
	}

	public void setPid(BigDecimal pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}