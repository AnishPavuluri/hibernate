package edu.model;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Long studentNo;
	private String studentName;
	private boolean studentStatus;

	// Constructors

	/** default constructor */
	public Student() {
	}

	

	// Property accessors

	public Long getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean getStudentStatus() {
		return this.studentStatus;
	}

	public void setStudentStatus(boolean studentStatus) {
		this.studentStatus = studentStatus;
	}

}