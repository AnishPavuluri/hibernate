package edu.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;

public class LoadCourseManyToManyListTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Course courseOne=null;
			Course courseTwo=null;
			List<Course> courseList=new ArrayList<Course>();
			Student student=new Student();
			courseOne=(Course)session.load(Course.class, new Long(1));
			courseTwo=(Course)session.load(Course.class, new Long(2));
			courseList.add(courseOne);
			courseList.add(courseTwo);
			student.setStudentName("N@IT1");
			student.setCourseList(courseList);
			session.save(student);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".Hibernate Exception:"+e);
		}finally{
			SessionUtil.closeSession();
		}

	}

}
