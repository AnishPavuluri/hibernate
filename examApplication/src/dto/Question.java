package dto;

import java.util.List;

/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private String type;
	private List<Answear> answears;

	// Constructors

	public List<Answear> getAnswears() {
		return answears;
	}

	public void setAnswears(List<Answear> answears) {
		this.answears = answears;
	}

	/** default constructor */
	public Question() {
	}

	/** minimal constructor */
	public Question(Short id, String type) {
		this.id = id;
		this.type = type;
	}

	/** full constructor */
	public Question(Short id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}