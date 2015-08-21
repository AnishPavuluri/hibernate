package model;

import java.util.Date;

/**
 * Ministataement entity. @author MyEclipse Persistence Tools
 */

public class Ministataement implements java.io.Serializable {

	// Fields

	private Short id;
	private Integer accno;
	private Integer balance;
	private Date transactionDate;
	private String transaction;

	// Constructors

	/** default constructor */
	public Ministataement() {
	}

	/** minimal constructor */
	public Ministataement(Short id, Integer accno) {
		this.id = id;
		this.accno = accno;
	}

	/** full constructor */
	public Ministataement(Short id, Integer accno, Integer balance,
			Date transactionDate) {
		this.id = id;
		this.accno = accno;
		this.balance = balance;
		this.transactionDate = transactionDate;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Integer getAccno() {
		return this.accno;
	}

	public void setAccno(Integer accno) {
		this.accno = accno;
	}

	public Integer getBalance() {
		return this.balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

}