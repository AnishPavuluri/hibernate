package edu.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Student implements java.io.Serializable {
	private Long studentNo;
	private String studentName;
	private List<Course> courseList;
	public Long getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

}