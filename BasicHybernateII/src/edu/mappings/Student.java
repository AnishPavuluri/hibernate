package edu.mappings;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String StudentNo;
	private String studentName;
	private String age;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String StudentNo) {
		this.StudentNo = StudentNo;
	}

	/** full constructor */
	public Student(String StudentNo, String studentName, String age) {
		this.StudentNo = StudentNo;
		this.studentName = studentName;
		this.age = age;
	}

	// Property accessors

	public String getStudentNo() {
		return this.StudentNo;
	}

	public void setStudentNo(String StudentNo) {
		this.StudentNo = StudentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/*public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}*/

}