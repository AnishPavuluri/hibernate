package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.util.SessionUtil;

public class HQLTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			String studentQuery="INSERT INTO Student1 (studentNo,studentName) SELECT student.studentNo,student.studentName FROM Student student";
			Query query=session.createQuery(studentQuery);
			int noOfRecords=query.executeUpdate();
			System.out.println(".No Of Records :"+noOfRecords);
			tx.commit();
		}
		catch (HibernateException e) {
			System.out.println(".hibernate Exception :"+e.getClass().getName()+"--"+e.getMessage());
			tx.rollback();
		}

	}

}
