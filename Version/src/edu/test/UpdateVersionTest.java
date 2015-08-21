package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class UpdateVersionTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
		Student student=(Student)session.get(Student.class,new Long(1));
		student.setStudentName("N@IT-U2");
		System.out.println("B.point - -Run -ReRunVersionTest Example");
		tx.commit();
		System.out.println(".SUCCESS.");
		}catch (HibernateException e) {
			tx.rollback();
		}finally{
			SessionUtil.closeSession();
		}

	}

}
