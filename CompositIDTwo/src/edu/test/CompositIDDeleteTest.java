package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.model.StudentId;
import edu.util.SessionUtil;

public class CompositIDDeleteTest {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			StudentId studentId=new StudentId();
			Student student=new Student();
			studentId.setStudentNoOne(new Long(1));
			studentId.setStudentNoTwo(new Long(1));
			student.setStudentId(studentId);
			session.delete(student);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("..EXception."+e.getMessage());
					
		}finally{
			SessionUtil.closeSession();
		}

	}

}
