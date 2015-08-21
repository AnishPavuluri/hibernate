package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.SessionUtil;

import dto.LoginDetails;

public class LoginDetailsDao {
	public void saveLoginDetails(LoginDetails loginDetails){
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(loginDetails);
		transaction.commit();
	}
	
	public void updatLoginDetails(LoginDetails loginDetails){
		String qu = "from LoginDetails";
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(qu);
		List<LoginDetails> loginDetailsList = query.list();
		for(LoginDetails l:loginDetailsList){
			if(l.getUser().getId().equals(loginDetails.getUser().getId())){
				l.setDate(loginDetails.getDate());
				loginDetails = l;
			}
		}
		session.merge(loginDetails);
		transaction.commit();
	}
	
	public List<LoginDetails> getLoginDetails(){
		String qu = "from LoginDetails";
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(qu);
		return query.list();
		
	}
}
