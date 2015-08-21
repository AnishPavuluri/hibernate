package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.MBAStudent;
import edu.model.MCAStudent;
import edu.util.SessionUtil;

public class TablePerSubClassTest {

	public static void main(String[] args) {
		Session session=null;
		Transaction tx;
		session=SessionUtil.getSession();
		tx=session.beginTransaction();
		try{
			MCAStudent mcaStudent=new MCAStudent();
			mcaStudent.setStudentName("MCAName");
			mcaStudent.setMcaStream("Computers");
			MBAStudent mbaStudent=new MBAStudent();
			mbaStudent.setStudentName("MBAName");
			mbaStudent.setMbaStream("Marketing");
			session.save(mcaStudent);
			session.save(mbaStudent);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("hibernate exception :"+e.getClass().getName()+"---->"+e.getMessage());
		}finally{
			SessionUtil.closeSession();
		}
	}
}
