package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class ProcedureTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Query query=session.getNamedQuery("studentProcedure");
			query.setString("sNo", "1");
			Student student=(Student)query.uniqueResult();
			System.out.println(". Student Name :"+student.getStudentName());
			tx.commit();
		}catch (HibernateException e) {
			System.err.println(".HiberNate Exception :"+e.getClass().getName()+"--->"+e.getMessage());
			tx.rollback();
		}

	}

}
