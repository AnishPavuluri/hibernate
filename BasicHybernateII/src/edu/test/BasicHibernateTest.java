package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.mappings.Student;
import edu.util.SessionUtil;
public class BasicHibernateTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			Student student=new Student();
			student.setStudentName("N@IT");
			session.save(student);
			System.out.println("===============");
			transaction.commit();
			System.out.println("--------->success<---------");
		}
		catch (HibernateException e) {
			System.out.println("++++++++++++++++++++++++++");
			System.err.println(".Hibernate Exception :"+e.getClass().getName()+"---"+e.getMessage());
			transaction.rollback();
		}
	}

}
