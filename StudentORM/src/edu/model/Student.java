package edu.model;

import java.io.Serializable;

public class Student implements Serializable{
	private String studentNo;
	private String studentName;
	
	
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	
	
}
