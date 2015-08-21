package edu.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.util.SessionUtil;

public class FunctionTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			List studentList=session.getNamedQuery("studentFunction").list();
			System.out.println(". No of Records :"+studentList.size());
			tx.commit();
		}catch (HibernateException e) {
			System.err.println(".HibernateException :"+e.getClass().getName()+"---->"+e.getMessage());
			tx.rollback();
		}

	}

}
