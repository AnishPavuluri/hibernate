package edu.mappings;

/**
 * Student1 entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String studentNo;
	private String studentName;
//	private String age;

	// Constructors

	/*public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
*/
	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public Student(String studentNo, String studentName) {
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// Property accessors

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}