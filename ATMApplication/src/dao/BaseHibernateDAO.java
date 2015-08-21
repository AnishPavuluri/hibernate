package dao;


import org.hibernate.Session;
import util.SessionUtil;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return SessionUtil.getSession();
	}
	
}