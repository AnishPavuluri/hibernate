package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Student;
import edu.util.SessionUtil;
public class SecondLevelCache {
	public static void main(String[] args) {
		Session sessionOne=SessionUtil.getSession();
		
		/*Transaction tx1=sessionOne.beginTransaction();
		Transaction tx2=sessionTwo.beginTransaction();*/
		Student student=null;
		try{
			student=(Student)sessionOne.load(Student.class,new Long(1));
			System.out.println(".sessionOne.1st time .Student Name.---------->"+student.getStudentName());
			System.out.println(".Break point update DB Record.");
			student=(Student)sessionOne.load(Student.class, new Long(1));
			sessionOne.close();
			System.out.println(".sessionOne.2nd time .student name :--------------->"+student.getStudentName());
			Session sessionTwo=SessionUtil.getSession();
			student=(Student)sessionTwo.load(Student.class, new Long(1));
			System.out.println(".session two .1st time.student Name.:----------->"+student.getStudentName());
			
			System.out.println("check the console there will be 1 DB Hits");
			System.out.println("Because there  are one sessionfactory so 1 DB Hits");
		}catch (HibernateException e) {
			e.printStackTrace();
			/*tx1.rollback();
			tx2.rollback();*/
		}
		finally{
		}
	}
}
