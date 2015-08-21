package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class RerunVersiontest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=(Student)session.get(Student.class,new Long(1));
			student.setStudentName("N@IT-U3");
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
		}finally{
			SessionUtil.closeSession();
		}
		System.out.println(".SUCCESS.");

	}

}
