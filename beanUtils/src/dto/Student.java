package dto;

import java.util.List;

public class Student {
	private Integer studentNo;
	private String studentName;
	private List<Integer> marks;
	private Course course;
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	
	
}
