package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.MBAStudent;
import edu.model.MCAStudent;
import edu.util.SessionUtil;
public class TablePerConcreteClassTest {
	public static void main(String[] args) {
		Session session=null;
		Transaction tx=null;
		session=SessionUtil.getSession();
		tx=session.beginTransaction();
		try{
			System.out.println("--------->begin");
			MCAStudent mcaStudent=new MCAStudent();
			mcaStudent.setStudentName("MCAName");
			mcaStudent.setMcaStream("Computers");
			MBAStudent mbaStudent=new MBAStudent();
			mbaStudent.setStudentName("MBAName");
			mbaStudent.setMbaStream("Marketing");
			session.save(mcaStudent);
			session.save(mbaStudent);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("Hibernate Exception :"+e.getClass().getName()+"--->"+e.getMessage());
		}finally{
			SessionUtil.closeSession();
		}
		System.out.println("..SUCCESS..");

	}

}
