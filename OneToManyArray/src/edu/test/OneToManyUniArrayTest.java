package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;
public class OneToManyUniArrayTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student studentOne=new Student();
			Student studentTwo=new Student();
			Student[] studentArray=new Student[2];
			Course course=new Course();
			studentOne.setStudentName("N@IT1");
			System.out.println("------>");
			studentTwo.setStudentName("N@IT2");
			System.out.println("-------->");
			studentArray=new Student[]{studentOne,studentTwo};
			course.setCourseName("MCA");
			System.out.println("-------->");
			course.setStudentArray(studentArray);
			System.out.println("------>");
			session.save(course);
			System.out.println("<----");
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.err.println(".OneTOManyUniArrayTest.main(String[]) "+e.getClass().getName()+"-->"+e.getMessage());
		}
		finally{
			SessionUtil.closeSession();
		}

	}

}
