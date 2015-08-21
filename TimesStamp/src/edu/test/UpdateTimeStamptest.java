package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class UpdateTimeStamptest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=(Student)session.load(Student.class, new Long(1));
			student.setStudentName("N@IT-U");
			session.update(student);
			tx.commit();
			System.out.println(".SUCCESS.");
		}catch (HibernateException e) {
			System.out.println(".."+e);
			tx.rollback();
		}finally{
			SessionUtil.closeSession();
		}

	}

}
