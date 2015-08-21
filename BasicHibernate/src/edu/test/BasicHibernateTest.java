package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.mappings.Student;
import edu.util.Hibernateutil;

public class BasicHibernateTest {
public static void main(String[] args) {
		Session session=Hibernateutil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			Student student=new Student();
//			student.setAge("40");
			student.setStudentNo("1");
			student.setStudentName("N@IT");
			session.update(student);
			transaction.commit();
		}catch(HibernateException e){
			System.err.println(".Hibernate Exception."+e.getClass().getName());
				}
		finally{
			Hibernateutil.closeSession();
		}
	}

}
