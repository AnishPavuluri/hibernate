import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;


public class OneToManyUniListTest {

	
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student studentOne=new Student();
			Student studentTwo=new Student();
			List<Student> studentList=new ArrayList<Student>();
			studentOne.setStudentName("N@IT1");
			studentTwo.setStudentName("N@IT2");
			studentList.add(studentOne);
			studentList.add(studentTwo);
			Course course=new Course();
			course.setCourseName("MCA");
			course.setStudentList(studentList);
			session.save(course);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".OneToManyUniArrayTest.main(String[]) "+e.getClass().getName()+" -->"+e.getMessage());
		}
		finally{
			SessionUtil.closeSession();
		}

	}

}
