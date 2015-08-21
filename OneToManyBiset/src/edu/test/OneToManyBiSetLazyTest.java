package edu.test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Course;
import edu.model.Student;
import edu.util.SessionUtil;

public class OneToManyBiSetLazyTest {
   public static void main(String[] args) {
	   Session session=SessionUtil.getSession();
	   Transaction tx=session.beginTransaction();
	   try{
		   Course course=(Course) session.get(Course.class, new Long(1));
		   System.out.println(".CourseNo."+course.getCourseNo());
		   Set<Student> studentSet=course.getStudentSet();
		   Iterator<Student> iterator=studentSet.iterator();
		   Student student=null;
		   while(iterator.hasNext()){
			   student=(Student)iterator.next();
			   System.out.println(".StudentNo."+student.getStudentNo());
			   System.out.println(".StudentName."+student.getStudentName());
		   }
		   tx.commit();
		   System.out.println(".SUCCESS.");
	   }catch (HibernateException e) {
		   tx.rollback();
		   System.out.println(".OneToManyLazyTest.main(string[]):"+e);
	}

	}

}
