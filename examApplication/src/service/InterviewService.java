package service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.SessionUtil;
import dto.Interview;

public class InterviewService {
	
	public Interview findInterViewerByName(String name){
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Interview where name=?");
		query.setString(0, name);
		return (Interview)query.uniqueResult();
		
	}
	
	public void updateInterviewMarks(String name, Short marks){
		Session session = SessionUtil.getSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from Interview where name=?");
		query.setString(0, name);
		Interview i = (Interview)query.uniqueResult();
		i.setMarks(marks);
		session.update(i);
		t.commit();
		
	}

}
