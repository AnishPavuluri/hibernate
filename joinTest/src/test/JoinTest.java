package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import dto.Student;
import dto.StudentClass;

import util.SessionUtil;

public class JoinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from StudentClass c left join fetch c.students s where s.address='Ayodhya'");
		List<StudentClass> studentClasses = query.list();
		for(StudentClass c : studentClasses){
			System.out.println("class name-->"+c.getClassName());
			for(Student s : c.getStudents()){
				System.out.println("s.getStudentName()--->"+s.getStudentName());
			}
		}}catch (Throwable e) {
			e.printStackTrace();
		}

	}

}
