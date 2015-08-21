package edu.model;

import java.util.Date;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Long studentNo;
	private String studentName;
	private Date timesStamp;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String studentName, Date timesStamp) {
		this.studentName = studentName;
		this.timesStamp = timesStamp;
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

	public Date getTimesStamp() {
		return this.timesStamp;
	}

	public void setTimesStamp(Date timesStamp) {
		this.timesStamp = timesStamp;
	}

}