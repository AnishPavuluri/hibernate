package test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import dto.Student;

import util.SessionUtil;

public class LoadTest {

	
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Student s where s.studentName in (:list)");
		List<String> list = new ArrayList<String>();
		list.add("RAMA");
		list.add("Sitha");
		query.setParameterList("list", list);
		List<Student> students = query.list();
		System.out.println(students.size());
		for(Student s: students){
			System.out.println(s.getStudentNo()+"--"+s.getStudentName()+"--"+s.getStudentAddress()+"--"+s.getStudentDateOfBirth());
		}
		
	}

}
