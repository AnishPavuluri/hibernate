package edu.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {
	private Long studentNo;
	private String studentName;
	private Map<String, Course> courseMap;
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
	public Map<String, Course> getCourseMap() {
		return courseMap;
	}
	public void setCourseMap(Map<String, Course> courseMap) {
		this.courseMap = courseMap;
	}
	
}