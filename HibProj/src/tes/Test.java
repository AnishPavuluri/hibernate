package tes;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.hibernate.Session;

import com.penchal.HibernateSessionFactory;
import com.penchal.Product;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		Product product = new Product();
		product.setPid(BigDecimal.TEN);
		product.setPname("Shirt");
		product.setPrice(Double.valueOf(100d));
		session.save(product);
		session.beginTransaction().commit();
		
		
		 
	}

}
