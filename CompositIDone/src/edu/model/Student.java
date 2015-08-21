package edu.model;


/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String studentName;
	private Long studentNoOne;
	private Long studentNoTwo;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
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


}