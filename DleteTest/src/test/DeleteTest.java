package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.CCourse;
import model.CStudent;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.SessionUtil;

public class DeleteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Set<CStudent> set = new HashSet<CStudent>();
		/*CStudent s1 = new CStudent();
		s1.setStudentNo(18);
		s1.setStudentName("Jagadesh");*/
		/*CStudent s2 = new CStudent();
		s2.setStudentNo(52);
		s2.setStudentName("Venkatesh");*/
		//set.add(s1);
		/*set.add(s2);*/
		CCourse course = (CCourse) session.load(CCourse.class, 1);
		//course = 
		//course.setCourseNo(1);
		System.out.println("-------->"+set);
		set.addAll(course.getStudentSet());
		System.out.println(""+set.size()+"========>"+set);
		//Iterator<CStudent> iterator = set.iterator();
		/*while(iterator.hasNext()){
			if(iterator.next().getStudentNo() == 4){
				System.out.println("----------");
				set.remove(iterator.next());
				
			}
		}*/
		for(CStudent s: set){
			if(s.getStudentNo()==4){
				set.remove(s);
				
			}
		}
		System.out.println(""+set.size()+"---set------------->"+set);
		//course.setCourseName("MCA");
		course.setStudentSet(set);
		try{
			session.save(course);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		transaction.commit();
		System.out.println("====SUCCESS=====");
	}

}
