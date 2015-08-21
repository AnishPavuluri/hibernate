package dto;

import java.sql.Timestamp;
import java.util.Date;

public class Student {
	private Integer studentNo;
	private String studentName;
	private String studentAddress;
	private Timestamp dateOfBirth;
	
	public Integer getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Timestamp getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
