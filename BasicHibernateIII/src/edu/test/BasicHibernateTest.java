package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.mappings.Student;
import edu.util.SessionUtil;

public class BasicHibernateTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			student.setStudentName("N@IT");
			session.save(student);
			tx.commit();
			
		}catch (HibernateException e) {
			System.err.println(".Hibernate exception."+e.getClass().getName()+"--"+e.getMessage());
			tx.rollback();
		}

	}

}
