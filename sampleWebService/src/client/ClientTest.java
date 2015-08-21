package client;

import java.util.Date;

import com.sun.jersey.api.client.Client;

import dto.Student;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClientTest clientTest = new ClientTest();
		Student student = clientTest.getStudent(1);
		System.out.println(student.getStudentName());
		System.out.println("#######################");
		Student s = new Student(11,"Hanuman","nlr",new Date());
		clientTest.storeStudent(s);
		System.out.println("### SUCCESS ###");
		

	}

	public Student getStudent(int id) {
		Client c = Client.create();
		Student s = c.resource("http://localhost:8081/sampleWebService/find/"+id).get(Student.class);
		return s;

	}
	
	public void storeStudent(Student student) {
		Client c = Client.create();
		c.resource("http://localhost:8081/sampleWebService/create/").post(student);
	}

}
