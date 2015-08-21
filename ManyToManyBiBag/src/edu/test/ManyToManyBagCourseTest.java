package edu.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;

public class ManyToManyBagCourseTest {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student studentOne=new Student();
			Student studentTwo=new Student();
			List<Student> studentSet=new ArrayList<Student>();
			Course courseOne=new Course();
			Course courseTwo=new Course();
			studentOne.setStudentName("N@IT1");
			studentTwo.setStudentName("N@IT2");
			studentSet.add(studentOne);
			studentSet.add(studentTwo);
			courseOne.setCourseName("java");
			courseTwo.setCourseName(".Net");
			courseOne.setStudentList(studentSet);
			courseTwo.setStudentList(studentSet);
			session.save(courseOne);
			session.save(courseTwo);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.err.println(".Hibernate Exception :"+e);
		}
		finally{
			SessionUtil.closeSession();
		}

	}

}
