package edu.mappings;

/**
 * StudentId entity. @author MyEclipse Persistence Tools
 */

public class StudentId implements java.io.Serializable {

	// Fields

	private String sno;
	private String sname;

	// Constructors

	/** default constructor */
	public StudentId() {
	}

	/** full constructor */
	public StudentId(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	// Property accessors

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
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

		return ((this.getSno() == castOther.getSno()) || (this.getSno() != null
				&& castOther.getSno() != null && this.getSno().equals(
				castOther.getSno())))
				&& ((this.getSname() == castOther.getSname()) || (this
						.getSname() != null
						&& castOther.getSname() != null && this.getSname()
						.equals(castOther.getSname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSno() == null ? 0 : this.getSno().hashCode());
		result = 37 * result
				+ (getSname() == null ? 0 : this.getSname().hashCode());
		return result;
	}

}