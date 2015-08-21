package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class SaveVersionTest {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			student.setStudentName("N@IT");
			session.save(student);
			System.out.println(student.getVersion());
			tx.commit();
			System.out.println(".SUCCESS.");
		}catch (HibernateException e) {
			// TODO: handle exception
		}
        
	}

}
