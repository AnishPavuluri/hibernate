package edu.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Inscourse entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {
	private Long courseNo;
	private String courseName;
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

}