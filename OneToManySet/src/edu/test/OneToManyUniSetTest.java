package edu.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.config.SessionUtil;
import edu.model.Course;
import edu.model.Student;

public class OneToManyUniSetTest {

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
			course.setCourseName("MCA");
			studentSet.add(studentOne);
			studentSet.add(studentTwo);
			course.setStudentSet(studentSet);
			session.save(course);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".OneToManyUniSetTest.main(String args[]) :"+e);
		}
		finally{
			SessionUtil.closeSession();
		}

	}

}
