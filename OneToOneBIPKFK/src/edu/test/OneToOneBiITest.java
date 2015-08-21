package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.model.Studentxtra;
import edu.util.SessionUtil;

public class OneToOneBiITest {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			Studentxtra studentxtra=new Studentxtra();
			studentxtra.setStudentAge("14");
			student.setStudentName("N@IT");
			studentxtra.setStudent(student);
			student.setStudentxtra(studentxtra);
			session.save(studentxtra);
//			session.save(student);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
		}
	}
}
