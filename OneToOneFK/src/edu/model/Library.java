package edu.model;

import java.math.BigDecimal;

/**
 * Library entity. @author MyEclipse Persistence Tools
 */

public class Library implements java.io.Serializable {

	// Fields

	private Long libraryNo;
	private String libraryName;
    private Student student;
	public Long getLibraryNo() {
		return libraryNo;
	}
	public void setLibraryNo(Long libraryNo) {
		this.libraryNo = libraryNo;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	} 
    
	
}