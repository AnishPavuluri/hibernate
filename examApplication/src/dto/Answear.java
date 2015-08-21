package dto;

/**
 * Answear entity. @author MyEclipse Persistence Tools
 */

public class Answear implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private Boolean ans;
	

	// Constructors

	/** default constructor */
	public Answear() {
	}

	/** minimal constructor */
	public Answear(Short id) {
		this.id = id;
	}

	/** full constructor */
	public Answear(Short id, String name, Boolean ans, Short QId) {
		this.id = id;
		this.name = name;
		this.ans = ans;
		
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getAns() {
		return this.ans;
	}

	public void setAns(Boolean ans) {
		this.ans = ans;
	}

	

}