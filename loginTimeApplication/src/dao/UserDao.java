package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.SessionUtil;

import dto.User;

public class UserDao {
	
	public User findUserByName(String name){
		System.out.println("---findUserByName----");
		Session session = SessionUtil.getSession();
		String q = "from User where userName = :uname";
		/*System.out.println("---------->"+q);*/
		Query query = session.createQuery(q);
		query.setString("uname", name);
		List<User> userList = (List<User>) query.list();
		if(userList.isEmpty())
			return null;
		else
			return userList.get(0);
	}
	
	public void saveUser(User user){
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
	}

}
