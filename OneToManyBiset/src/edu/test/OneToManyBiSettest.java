package edu.test;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;

public class OneToManyBiSettest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student studentOne=new Student();
			Student studentTwo=new Student();
			Set<Student> studentSet=new HashSet<Student>();
			Course course=new Course();
			studentOne.setStudentName("N@IT1");
			studentTwo.setStudentName("N@IT2");
			studentSet.add(studentOne);
			studentSet.add(studentTwo);
			course.setCourseName("MCA");
			studentOne.setCourse(course);
			studentTwo.setCourse(course);
			course.setStudentSet(studentSet);
			session.save(course);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			System.out.println(".OneToManyBiSetTest.main(String[]) :"+e);
		}finally{
			SessionUtil.closeSession();
		}

	}

}
