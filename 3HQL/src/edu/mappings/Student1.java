package edu.mappings;

/**
 * Student1 entity. @author MyEclipse Persistence Tools
 */

public class Student1 implements java.io.Serializable {

	// Fields

	private String studentNo;
	private String studentName;

	// Constructors

	/** default constructor */
	public Student1() {
	}

	/** minimal constructor */
	public Student1(String studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public Student1(String studentNo, String studentName) {
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// Property accessors

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}