package edu.model;

public class Student implements java.io.Serializable {
	private Short studentNo;
	private String studentName;
	private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Short getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(Short studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}