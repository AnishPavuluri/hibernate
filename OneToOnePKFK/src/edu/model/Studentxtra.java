package edu.model;


/**
 * Studentxtra entity. @author MyEclipse Persistence Tools
 */

public class Studentxtra implements java.io.Serializable {

	// Fields

	private Long studentNo;
	private Student student;
	private String studentAge;
	public Long getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	
}