package edu.test;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.mappings.Student;
import edu.util.HibernateUtil;

public class BasicHybernateTest {

	
	public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			Student student=new Student();
			student.setStudentNo("1");
			student.setStudentName("N@IT");
			session.save(student);
			transaction.commit();
			System.out.println("...success...");
		}
		catch (HibernateException e) {
			// TODO: handle exception
		}
		finally{
			HibernateUtil.closeSession();
		}

	}

}
