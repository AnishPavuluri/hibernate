package edu.model;

public class Course implements java.io.Serializable {
	private Long courseNo;
	private String courseName;
	private Student[] studentArray;
	public Long getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(Long courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Student[] getStudentArray() {
		return studentArray;
	}
	public void setStudentArray(Student[] studentArray) {
		this.studentArray = studentArray;
	}
}