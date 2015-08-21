package edu.model;

/**
 * Studentxtra entity. @author MyEclipse Persistence Tools
 */

public class StudentXtra implements java.io.Serializable {

	// Fields

	private Long studentNo;
	private String studentAge;
	public Long getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	
}