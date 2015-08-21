package edu.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
public class Course implements java.io.Serializable {
	private Long courseNo;
	private String courseName;
	private Set<Student> studentSet;
	public Long getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(Long courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Set<Student> getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}
}