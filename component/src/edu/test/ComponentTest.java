package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Address;
import edu.model.Student;
import edu.util.SessionUtil;

public class ComponentTest {

	public static void main(String[] args) {
		Student student=null;
		Address address=null;
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			student=new Student();
			student.setStudentName("N@IT");
			address=new Address();
			address.setDoorNo("5-325");
			address.setStreet("ASRR");
			student.setAddress(address);
			session.save(student);
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.err.println(".hibernate Exception :"+e.getClass().getName()+"--->"+e.getMessage());
			
		}
		finally{
			SessionUtil.closeSession();
		}

	}

}
