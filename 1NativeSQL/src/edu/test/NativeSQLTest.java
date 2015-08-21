package edu.test;

import java.util.List;

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
			String query="SELECT * FROM STUDENT student";
			SQLQuery sqlQuery=session.createSQLQuery(query);
			List studentList=sqlQuery.list();
			System.out.println(". No of records :"+studentList.size());
			tx.commit();
		}catch (HibernateException e) {
			System.out.println(". Hibernate Exception :"+e.getClass().getName()+"-->"+e.getMessage());
			tx.rollback();
		}

	}

}
