package dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Long sno;
	private String sname;
	private String sadd;
	private Date dob;
	private Set studentIncourses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Long sno) {
		this.sno = sno;
	}

	/** full constructor */
	public Student(Long sno, String sname, String sadd, Date dob,
			Set studentIncourses) {
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.dob = dob;
		this.studentIncourses = studentIncourses;
	}

	// Property accessors

	public Long getSno() {
		return this.sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return this.sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Set getStudentIncourses() {
		return this.studentIncourses;
	}

	public void setStudentIncourses(Set studentIncourses) {
		this.studentIncourses = studentIncourses;
	}

}