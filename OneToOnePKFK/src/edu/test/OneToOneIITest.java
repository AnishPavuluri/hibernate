package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Student;
import edu.model.Studentxtra;
import edu.util.SessionUtil;
public class OneToOneIITest {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			Studentxtra studentxtra=new Studentxtra();
			student.setStudentName("N@IT");
			studentxtra.setStudentAge("20");
			studentxtra.setStudent(student);
			session.save(student);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".OneToOneIITest.main(String[]):"+e);
		}finally{
			SessionUtil.closeSession();
		}
	}
}
