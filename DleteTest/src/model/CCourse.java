package model;

import java.util.Set;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;

/**
 * CCourse entity. @author MyEclipse Persistence Tools
 */

public class CCourse implements java.io.Serializable {

	// Fields

	private int courseNo;
	private String courseName;
	private Set<CStudent> studentSet;
	// Constructors

	/** default constructor */
	public CCourse() {
	}
	public Set<CStudent> getStudentSet() {
		return studentSet;
	}
	
	public void setStudentSet(Set<CStudent> studentSet) {
		this.studentSet = studentSet;
	}

	/** minimal constructor */
	public CCourse(Short courseNo) {
		this.courseNo = courseNo;
	}

	/** full constructor */
	public CCourse(Short courseNo, String courseName) {
		this.courseNo = courseNo;
		this.courseName = courseName;
	}

	// Property accessors

	public int getCourseNo() {
		return this.courseNo;
	}

	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}