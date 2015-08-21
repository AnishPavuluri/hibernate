package edu.test;

import javax.security.auth.login.Configuration;

import edu.model.Student;

public class BasicHybernateTest {
	public static void main(String[] args) {
		Student student=new Student();
		student.setStudentNo("1");
		student.setStudentName("N@IT");
		Configuration configuration=new Configuration();
	}

}
