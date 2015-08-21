package dto;

/**
 * Interview entity. @author MyEclipse Persistence Tools
 */

public class Interview implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private Short marks;

	// Constructors

	/** default constructor */
	public Interview() {
	}

	/** minimal constructor */
	public Interview(Short id) {
		this.id = id;
	}

	/** full constructor */
	public Interview(Short id, String name, Short marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public Short getMarks() {
		return this.marks;
	}

	public void setMarks(Short marks) {
		this.marks = marks;
	}

}