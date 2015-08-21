package service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.SessionUtil;

import dto.Question;

public class QuestionService {
	
	public List<Question> findQuestion(){
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Question");
		return query.list();
	}

}
