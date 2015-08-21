package edu.model;
public class Student implements java.io.Serializable {

	private Long studentNoOne;
	private Long studentNoTwo;
	private String studentName;

	public Long getStudentNoOne() {
		return studentNoOne;
	}

	public void setStudentNoOne(Long studentNoOne) {
		this.studentNoOne = studentNoOne;
	}

	public Long getStudentNoTwo() {
		return studentNoTwo;
	}

	public void setStudentNoTwo(Long studentNoTwo) {
		this.studentNoTwo = studentNoTwo;
	}
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}