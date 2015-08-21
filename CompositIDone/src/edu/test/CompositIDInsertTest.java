package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class CompositIDInsertTest {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			student.setStudentNoOne(new Long(1));
			student.setStudentNoTwo(new Long(1));
			student.setStudentName("N@IT");
			session.save(student);
			tx.commit();
			System.out.println("..SUCCESS..");
			
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("...Hibernate Exception :"+e.getClass().getName()+"--->"+e.getMessage());
		}finally{
			SessionUtil.closeSession();
		}

	}

}
