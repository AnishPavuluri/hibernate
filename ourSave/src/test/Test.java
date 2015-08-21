package test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import util.OurSession;
import dto.Student;

public class Test {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter student no::");
		Integer sno = scanner.nextInt();
		System.out.println("enter student name ::");
		String name = scanner.next();
		System.out.println("enter student address ::");
		String address = scanner.next();
		System.out.println("enter student data of birth :: (dd/MM/yyyy)");
		String dob = scanner.next();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date d = simpleDateFormat.parse(dob);
		Student student = new Student();
		student.setStudentNo(sno);
		student.setStudentName(name);
		student.setStudentAddress(address);
		student.setDateOfBirth(new Timestamp(d.getTime()));
		OurSession ourSession = new OurSession();
		ourSession.save(student);
		System.out.println("SUCCESS");
	}
}
