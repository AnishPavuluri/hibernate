package edu.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.model.MBAStudent;
import edu.model.MCAStudent;
import edu.util.SessionUtil;

public class TablePerClassTest {

	public static void main(String[] args) {
		MCAStudent mcaStudent=new MCAStudent("MCAName", "Computers");
		MBAStudent mbaStudent=new MBAStudent("MBAName", "Marketing");
		Session session=null;
		Transaction tx=null;
		try{
			session=SessionUtil.getSession();
			tx=session.beginTransaction();
			session.save(mcaStudent);
			session.save(mbaStudent);
			tx.commit();
			
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println(".Hibernate Exception :"+e);
		}finally{
			SessionUtil.closeSession();
		}
		System.out.println("..SUCCESS..");
	}

}
