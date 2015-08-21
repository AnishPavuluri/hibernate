package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class StudentDao {
	public List<Student> getStudents() {
		Session session = SessionUtil.getSession();
		String hqlQuery = "from Student";
		Query query = session.createQuery(hqlQuery);
		List<Student> students = query.list();
		for (Student student : students) {
			System.out.println("name...>" + student.getName() + "..."
					+ "course........>" + student.getMarks());
		}
		return students;
	}
	public List<Student> searchStudents(String name,String value){
		
		return null;
		
	}
}
