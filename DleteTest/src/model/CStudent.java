package model;

/**
 * CStudent entity. @author MyEclipse Persistence Tools
 */

public class CStudent implements java.io.Serializable {

	// Fields

	private int studentNo;
	private String studentName;

	// Constructors

	/** default constructor */
	public CStudent() {
	}

	/** minimal constructor */
	public CStudent(Short studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public CStudent(Short studentNo, String studentName) {
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// Property accessors

	public int getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "CStudent [studentName=" + studentName + ", studentNo="
				+ studentNo + "]";
	}

}