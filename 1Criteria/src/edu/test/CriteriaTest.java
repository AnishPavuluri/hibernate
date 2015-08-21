package edu.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import edu.mappings.Student;
import edu.util.SessionUtil;

public class CriteriaTest {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		try {
			Object object=session.createCriteria(Student.class).setProjection(Projections.sum("studentNo")).uniqueResult();
			System.out.println(".SUM :"+object);
			tx.commit();
		} catch (HibernateException e) {
			System.out.println(".Hibernate Exception :"
					+ e.getClass().getName() + "--" + e.getMessage());
			tx.rollback();
		}

	}

}
