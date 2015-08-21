package model;

/**
 * PerminentAddId entity. @author MyEclipse Persistence Tools
 */

public class PerminentAdd implements java.io.Serializable {

	private Integer id;
	private String address;

	// Constructors

	/** default constructor */
	public PerminentAdd() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	

}