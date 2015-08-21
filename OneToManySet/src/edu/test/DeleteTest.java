package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.config.SessionUtil;
import edu.model.Course;

public class DeleteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Course c=new Course();
			c.setCourseNo(30l);
			session.delete(c);
			tx.commit();
			System.out.println("success");
			
		}catch (HibernateException e) {
			e.printStackTrace();
		}

	}

}
