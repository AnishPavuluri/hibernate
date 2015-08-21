package dao;

import java.util.List;

import model.Ministataement;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * A data access object (DAO) providing persistence and search support for
 * Ministataement entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see model.Ministataement
 * @author MyEclipse Persistence Tools
 */

@Component
public class MinistataementDAO extends BaseHibernateDAO {
	

	public void save(Ministataement transientInstance) {
		try {
			Transaction transaction = getSession().beginTransaction();
			Object o = getSession().save(transientInstance);
			transaction.commit();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Ministataement persistentInstance) {
		try {
			getSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Ministataement findById(java.lang.Short id) {
		try {
			Ministataement instance = (Ministataement) getSession().get(
					"mapping.Ministataement", id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List findByExample(Ministataement instance) {
		try {
			List results = getSession()
					.createCriteria("mapping.Ministataement").add(
							Example.create(instance)).list();
			
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<Ministataement> findByProperty(String propertyName, Object value) {
		System.out.println("finding Ministataement instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queyString = "from Ministataement as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queyString);
			System.out.println("n");
			queryObject.setParameter(0, value);
			System.out.println("i");
			List list = queryObject.list();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+list.size());
			List<Ministataement> minList = list;
			return minList;
		} catch (RuntimeException re) {
			re.printStackTrace();
			return null;
		}
	}

	public List findAll() {
		try {
			String queryString = "from Ministataement";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Ministataement merge(Ministataement detachedInstance) {
		try {
			Ministataement result = (Ministataement) getSession().merge(
					detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachDirty(Ministataement instance) {
		try {
			getSession().saveOrUpdate(instance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachClean(Ministataement instance) {
		try {
			getSession().lock(instance, LockMode.NONE);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public static void main(String[] args) {
		MinistataementDAO m = new MinistataementDAO();
		m.findByProperty("accno",1001);
	}
}