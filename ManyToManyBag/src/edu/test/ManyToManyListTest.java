package edu.test;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;
public class ManyToManyListTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Course courseOne=new Course();
			Course courseTwo=new Course();
			List<Course> courseList=new ArrayList<Course>();
			Student studentOne=new Student();
			Student studentTwo=new Student();
			courseOne.setCourseName("Java");
			courseTwo.setCourseName(".Net");
			courseList.add(courseOne);
			courseList.add(courseTwo);
			studentOne.setStudentName("N@IT1");
			studentTwo.setStudentName("N@IT2");
			studentOne.setCourseList(courseList);
			studentTwo.setCourseList(courseList);
			session.save(studentOne);
			session.save(studentTwo);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.err.println("..Hibenate Exception :"+e);
		}finally{
			SessionUtil.closeSession();
		}

	}

}
