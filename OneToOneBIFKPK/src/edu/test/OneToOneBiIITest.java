package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Library;
import edu.model.Student;
import edu.util.Sessionutil;

public class OneToOneBiIITest {

	public static void main(String[] args) {
		Session session=Sessionutil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			Library library=new Library();
			student.setStudentName("N@IT");
			library.setLibraryName("java");
			student.setLibrary(library);
			library.setStudent(student);
			session.save(library);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".OneToOneBiIITest.main(String[]):"+e.getClass().getName()+"------>"+e.getMessage());
		}finally{
			Sessionutil.closeSession();
		}

	}

}
