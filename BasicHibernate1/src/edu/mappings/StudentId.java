package edu.mappings;

/**
 * StudentId entity. @author MyEclipse Persistence Tools
 */

public class StudentId implements java.io.Serializable {

	// Fields

	private String studentNo;
	private String sname;

	// Constructors

	/** default constructor */
	public StudentId() {
	}

	/** full constructor */
	public StudentId(String studentNo, String sname) {
		this.studentNo = studentNo;
		this.sname = sname;
	}

	// Property accessors

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentId))
			return false;
		StudentId castOther = (StudentId) other;

		return ((this.getStudentNo() == castOther.getStudentNo()) || (this
				.getStudentNo() != null
				&& castOther.getStudentNo() != null && this.getStudentNo()
				.equals(castOther.getStudentNo())))
				&& ((this.getSname() == castOther.getSname()) || (this
						.getSname() != null
						&& castOther.getSname() != null && this.getSname()
						.equals(castOther.getSname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStudentNo() == null ? 0 : this.getStudentNo().hashCode());
		result = 37 * result
				+ (getSname() == null ? 0 : this.getSname().hashCode());
		return result;
	}

}