package edu.test;
import java.util.HashMap;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;
public class ManyToManyMapTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Course courseOne=new Course();
			Course courseTwo=new Course();
			HashMap<String, Course> courseMap=new HashMap<String, Course>();
			Student studentOne=new Student();
			Student studentTwo=new Student();
			courseOne.setCourseName("Java");
			courseTwo.setCourseName(".Net");
			courseMap.put("Java", courseOne);
			courseMap.put(".Net", courseTwo);
			studentOne.setStudentName("Naresh It");
			studentOne.setCourseMap(courseMap);
			studentTwo.setStudentName("Naresh It");
			studentTwo.setCourseMap(courseMap);
			session.save(studentOne);
			session.save(studentTwo);
			tx.commit();
			System.out.println("..SUCCESS..");
				}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".hibernate exception :"+e);
		}finally{
			SessionUtil.closeSession();
		}
	}

}
