package edu.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import edu.model.Course;
import edu.util.SessionUtil;

public class loadTest {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(Course.class);
		List<Course> courses = criteria.list();
		for(Course c: courses){
			System.out.println(c.getCourseNo()+"--"+c.getStudentSet().size());
			
		}
	}
	

}
