package test;

public class Student implements Comparable<Student> {
	private Integer no;
	private String name;
	
	
	
	public Student(Integer no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public Student() {
		super();
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
	

}
