package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;

public class ManyToOneParentAndChildTwoTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student studentOne=new Student();
			Student studentTwo=new Student();
			Course course=new Course();
			studentOne.setStudentName("N@IT5");
			studentTwo.setStudentName("N@IT6");
			course.setCourseName("BTec");
			studentOne.setCourse(course);
			studentTwo.setCourse(course);
			session.save(studentOne);
			session.save(studentTwo);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".ManyToOneTest.main(String[]) :"+e);
		}finally{
			SessionUtil.closeSession();
		}

	}

}
