package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Student;
import edu.util.SessionUtil;
public class BasicHibernateTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			student.setStudentName("N@IT");
			student.setLocation("HYD");
			session.save(student);
			tx.commit();
			System.out.println("..success..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("..hibernate Exception.."+e.getClass().getName()+"--->"+e.getMessage());
		}finally{
			SessionUtil.closeSession();
		}

	}

}
