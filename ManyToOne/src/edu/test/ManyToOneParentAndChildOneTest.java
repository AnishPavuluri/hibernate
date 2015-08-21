package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;
public class ManyToOneParentAndChildOneTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student student=new Student();
			Course course=new Course();
			student.setStudentName("N@IT4");
			course.setCourseName("MBA");
			student.setCourse(course);
			session.save(student);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
	        tx.rollback();
	        System.out.println("ManyToOneTest.main(String[])"+e);
		}finally{
			SessionUtil.closeSession();
		}

	}

}
