package edu.model;

import java.math.BigDecimal;


/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Long studentNo;
	private Course course;
	private String studentName;
	public Long getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	

}