package test;

import java.util.Date;

import dto.Student;
import service.StudentService;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		/*Student s = studentService.findStudentBasedOnId(1);
		System.out.println(s.getStudentName());*/
		Student s = new Student(10,"rama","hydebad",new Date());
		studentService.createStudent(s);
		System.out.println("success");

	}

}
