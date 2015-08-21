package edu.test;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.model.Studentxtra;
import edu.util.Sessionutil;

public class OneToOneIITest {
	public static void main(String[] args) {
		Session session=Sessionutil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			Studentxtra studentxtra=new Studentxtra();
			student.setStudentNo(new Long(1));
			student.setStudentName("N@IT");
			studentxtra.setStudentNo(student.getStudentNo());
			studentxtra.setStudentAge("20");
			studentxtra.setStudent(student);
			session.save(studentxtra);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".OneToOneIITest.main(String[]):"+e);
		}finally{
			Sessionutil.closeSession();
		}
		

	}

}
