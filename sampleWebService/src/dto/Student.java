package dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
@XmlRootElement
public class Student implements java.io.Serializable {

	// Fields

	private Integer studentNo;
	private String studentName;
	private String studentAddress;
	private Date studentDateOfBirth;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public Student(Integer studentNo, String studentName, String studentAddress,
			Date studentDateOfBirth) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentDateOfBirth = studentDateOfBirth;
	}

	// Property accessors

	public Integer getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return this.studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Date getStudentDateOfBirth() {
		return this.studentDateOfBirth;
	}

	public void setStudentDateOfBirth(Date studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

	

}