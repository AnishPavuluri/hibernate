package edu.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class NamedQueries {

	public static void main(String[] args) {
		int i=1;
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Query query=session.getNamedQuery("sqlQuery");
			List studentList=query.list();
            System.out.println(". No Of Records :"+studentList.size());
			tx.commit();
		}catch (HibernateException e) {
			System.out.println(".Hibernate Exception :"+e.getClass().getName()+"--->"+e.getMessage());
			tx.rollback();
		}
		

	}

}
