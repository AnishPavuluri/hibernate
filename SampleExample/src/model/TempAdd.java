package model;

/**
 * TempAdd entity. @author MyEclipse Persistence Tools
 */

public class TempAdd implements java.io.Serializable {
	private Integer id;
	private Integer primarykey;
	private String address;
	

	public Integer getId() {
		return id;
	}

	public Integer getPrimarykey() {
		return primarykey;
	}

	public void setPrimarykey(Integer primarykey) {
		this.primarykey = primarykey;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	
}