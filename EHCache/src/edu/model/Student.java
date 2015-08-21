package edu.model;
public class Student implements java.io.Serializable {
	private Long studentNo;
	private String studentName;
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
}