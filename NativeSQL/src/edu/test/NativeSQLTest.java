package edu.test;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.util.SessionUtil;

public class NativeSQLTest {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			String query="SELECT AVG(SNO) sno FROM STUDENT";
			SQLQuery sqlQuery=session.createSQLQuery(query);
			sqlQuery.addScalar("sno",Hibernate.DOUBLE);
			Object object=sqlQuery.uniqueResult();
			System.out.println(".Result object type :"+object.getClass().getName());
			System.out.println(".AVG :"+object);
			tx.commit();
		}catch (HibernateException e) {
			System.out.println(".Hibernate Exception :"+e.getClass().getName()+"--->"+e.getMessage());
			tx.rollback();
		}
	}

}
