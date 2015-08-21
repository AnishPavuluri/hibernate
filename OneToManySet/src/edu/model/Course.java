package edu.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * UnCourse entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private Long courseNo;
	private String courseName;
	private Set studentSet;
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
	public Set getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set studentSet) {
		this.studentSet = studentSet;
	}
	

}