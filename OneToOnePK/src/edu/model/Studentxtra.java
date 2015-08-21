package edu.model;


/**
 * Studentxtra entity. @author MyEclipse Persistence Tools
 */

public class Studentxtra implements java.io.Serializable {

	private Long studentNo;
	private String studentAge;
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
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