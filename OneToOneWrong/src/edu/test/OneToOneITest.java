package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Student;
import edu.model.StudentXtra;
import edu.util.SessionUtil;
public class OneToOneITest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			StudentXtra studentXtra=new StudentXtra();
			student.setStudentNo(new Long(1));
			student.setStudentName("N@IT");
			studentXtra.setStudentNo(new Long(1));
			studentXtra.setStudentAge("20");
			session.save(student);
			System.out.println("==================");
			session.save(studentXtra);
			System.out.println("+++++++++++++++++");
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			System.out.println("in catch block");
			tx.rollback();
			System.out.println(".hibernate exception :"+e.getClass().getName()+"-->"+e.getMessage());
		}finally{
			SessionUtil.closeSession();
		}

	}

}
