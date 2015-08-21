package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class FirstLevelCache {
	public static void main(String[] args) {
		Session sessionOne=SessionUtil.getSession();
		
		
		Student student=null;
		
		try{
			student=(Student)sessionOne.load(Student.class, new Long(1));
			System.out.println(".Sessioneone.1st Time.Student Name."+student.getStudentName());
			System.out.println(".Break point .Update DB Record.");
			student=(Student)sessionOne.load(Student.class,new Long(1));
			System.out.println("sessionOne.2nd time . Student Name."+student.getStudentName());
			sessionOne.close();
			Session sessionTwo=SessionUtil.getSession();
			student=(Student)sessionTwo.load(Student.class,new Long(1));
			System.out.println(".sessionTwo.1st Time.Student Name."+student.getStudentName());
			System.out.println("check the console there will be 2 DB hits");
			System.out.println("Because there are two session's so 2 DB Hits");
		}catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
