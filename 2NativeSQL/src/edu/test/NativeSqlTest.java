package edu.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.Student;
import edu.util.SessionUtil;

public class NativeSqlTest {

	
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			String query="SELECT {student.*} FROM STUDENT student";
			SQLQuery sqlQuery=session.createSQLQuery(query);
			sqlQuery.addEntity("student", Student.class);
			List studentList=sqlQuery.list();
			Iterator i=studentList.iterator();
			while(i.hasNext()){
				Student s=(Student) i.next();
				System.out.println("StudentNo :"+s.getStudentNo());
				System.out.println("studentName :"+s.getStudentName());
				System.out.println("-----------------------------");
			}
			System.out.println(". No of Records :"+studentList.size());
			transaction.commit();
		}catch (HibernateException e) {
			System.out.println(". Hibernate Exception :"+e.getClass().getName()+"---->"+e.getMessage());
			transaction.rollback();
		}

	}

}
