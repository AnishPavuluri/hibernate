package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class SaveTimeStamptest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			student.setStudentName("N@IT");
			session.save(student);
			System.out.println(student.getTimesStamp());
			tx.commit();
		}catch (HibernateException e) {
			System.out.println(".."+e);
			tx.rollback();
		}finally{
			SessionUtil.closeSession();
		}

	}

}
