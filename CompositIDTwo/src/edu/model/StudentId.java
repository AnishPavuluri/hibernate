package edu.model;


public class StudentId implements java.io.Serializable {


	private Long StudentNoOne;
	private Long StudentNoTwo;

	/** default constructor */
	public StudentId() {
	}

	/** full constructor */
	public StudentId(Long StudentNoOne, Long StudentNoTwo) {
		this.StudentNoOne = StudentNoOne;
		this.StudentNoTwo = StudentNoTwo;
	}

	// Property accessors

	public Long getStudentNoOne() {
		return this.StudentNoOne;
	}

	public void setStudentNoOne(Long StudentNoOne) {
		this.StudentNoOne = StudentNoOne;
	}

	public Long getStudentNoTwo() {
		return this.StudentNoTwo;
	}

	public void setStudentNoTwo(Long StudentNoTwo) {
		this.StudentNoTwo = StudentNoTwo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentId))
			return false;
		StudentId castOther = (StudentId) other;

		return ((this.getStudentNoOne() == castOther.getStudentNoOne()) || (this
				.getStudentNoOne() != null
				&& castOther.getStudentNoOne() != null && this
				.getStudentNoOne().equals(castOther.getStudentNoOne())))
				&& ((this.getStudentNoTwo() == castOther.getStudentNoTwo()) || (this
						.getStudentNoTwo() != null
						&& castOther.getStudentNoTwo() != null && this
						.getStudentNoTwo().equals(castOther.getStudentNoTwo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getStudentNoOne() == null ? 0 : this.getStudentNoOne()
						.hashCode());
		result = 37
				* result
				+ (getStudentNoTwo() == null ? 0 : this.getStudentNoTwo()
						.hashCode());
		return result;
	}

}