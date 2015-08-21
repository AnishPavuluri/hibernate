package edu.model;


/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private StudentId studentId;
	private String studentName;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(StudentId studentId) {
		this.studentId = studentId;
	}

	/** full constructor */
	public Student(StudentId id, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	// Property accessors


	public StudentId getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentId studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}