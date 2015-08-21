package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class CompositIDLoadTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student studentLoad=new Student();
			studentLoad.setStudentNoOne(new Long(1));
			studentLoad.setStudentNoTwo(new Long(1));
			Student student=(Student)session.get(Student.class,studentLoad );
			System.out.println("studentNoOne :"+student.getStudentNoOne());
			System.out.println("studentNoTwo :"+student.getStudentNoTwo());
			System.out.println("studentName :"+student.getStudentName());
			tx.commit();
		}catch (HibernateException e) {
			System.out.println(e);
		}finally{
			SessionUtil.closeSession();
		}
		

	}

}
