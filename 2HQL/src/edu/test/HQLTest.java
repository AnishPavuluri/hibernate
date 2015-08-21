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
		String hqlQuery="UPDATE Student SET studentName=:sName WHERE studentNo=?";
		Query query=session.createQuery(hqlQuery);
		query.setString("sName", "N@IT-U");
		query.setString(0,"1");
		int noOrRecords=query.executeUpdate();
		System.out.println(".No Of Records :"+noOrRecords);
		tx.commit();
		}catch (HibernateException e) {
			System.out.println(".Hibernate Exception :"+e.getClass().getName()+"--"+e.getMessage());
			tx.rollback();
		}

	}

}
