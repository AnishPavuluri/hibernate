package model;

/**
 * Atmaccount entity. @author MyEclipse Persistence Tools
 */

public class AtmAccount implements java.io.Serializable {

	// Fields

	private Integer accno;
	private Integer balance;

	// Constructors

	/** default constructor */
	public AtmAccount() {
	}

	/** minimal constructor */
	public AtmAccount(Integer accno) {
		this.accno = accno;
	}

	/** full constructor */
	public AtmAccount(Integer accno, Integer balance) {
		this.accno = accno;
		this.balance = balance;
	}

	// Property accessors

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

}