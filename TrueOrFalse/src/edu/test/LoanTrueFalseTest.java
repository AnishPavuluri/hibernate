package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class LoanTrueFalseTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=(Student)session.get(Student.class,new Long(1));
			System.out.println(".Student Name :"+student.getStudentName());
			System.out.println(".StudentStatus :"+student.getStudentStatus());
		}catch (HibernateException e) {
			
		}

	}

}
