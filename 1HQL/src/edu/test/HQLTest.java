package edu.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.mappings.Student;
import edu.util.SessionUtil;

public class HQLTest {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			String hqlQuery="FROM Student ORDER BY studentNo ASC";
			Query query=session.createQuery(hqlQuery);
			query.setFirstResult(0);
			query.setMaxResults(2);
			List studentList=query.list();
			/*for(Student s:studentList){
				System.out.println(s.getStudentNo());
				System.out.println(s.getStudentName());
			}*/
			Iterator i=studentList.iterator();
			while (i.hasNext()) {
			Student s=(Student) i.next();
			System.out.println(s.getStudentNo());
			System.out.println(s.getStudentName());
				
			}
			
			System.out.println(".No Of records :"+studentList.size());
			tx.commit();
		}catch (HibernateException e) {
			System.out.println("Hibernate exception :"+e.getClass().getName()+"--"+e.getMessage());
			tx.rollback();
		}
		finally{
			SessionUtil.closeSession();
		}

	}

}
