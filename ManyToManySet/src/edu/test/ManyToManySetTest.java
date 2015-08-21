package edu.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;

public class ManyToManySetTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student studentOne=new Student();
			Student studentTwo=new Student();
			Set<Student> studentSet=new HashSet<Student>();
			Course courseOne=new Course();
			Course courseTwo=new Course();
			studentOne.setStudentName("N@IT1");
			studentTwo.setStudentName("N@IT2");
			studentSet.add(studentOne);
			studentSet.add(studentTwo);
			courseOne.setCourseName("Java");
			courseTwo.setCourseName(".Net");
			courseOne.setStudentSet(studentSet);
			courseTwo.setStudentSet(studentSet);
			session.save(courseOne);
			session.save(courseTwo);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".Hibernate Exception :"+e);
		}finally{
			SessionUtil.closeSession();
		}

	}

}
