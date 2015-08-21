package edu.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Course;
import edu.model.Student;
import edu.util.sessionUtil;

public class OneToManyBagTest {

	public static void main(String[] args) {
		Session session=sessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			Student studentOne=new Student();
			Student studentTwo=new Student();
			List<Student> studentList=new ArrayList<Student>();
			Course course=new Course();
			studentOne.setStudentName("N@IT1");
			studentTwo.setStudentName("N@IT2");
			studentList.add(studentOne);
			studentList.add(studentTwo);
			course.setCourseName("MCA");
			course.setStudentList(studentList);
			session.save(course);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".OneToManyBagTest.main(string args[]) :"+e);
		}
		finally{
			sessionUtil.closeSession();
		}

	}

}
