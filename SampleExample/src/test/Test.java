package test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

import util.SessionUtil;

import model.Employee;
import model.PerminentAdd;
import model.TempAdd;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee employee = new Employee();
		PerminentAdd perminentAdd = new PerminentAdd();
		TempAdd tempAdd = new TempAdd();
		Session session = SessionUtil.getSession();
		employee = (Employee) session.load(Employee.class, 1001);
		System.out.println("employee name----->"+employee.getName());
		/*PerminentAdd p = employee.getPerminentAdds();
		System.out.println("p add-->"+p.getAddress());
		System.out.println("p id-->"+p.getId());
		try{
		Set<TempAdd> tempAdds = employee.getTempAdd();
		//System.out.println(tempAdds.size());
		for(TempAdd t : tempAdds){
			System.out.println("t add-->"+t.getAddress());
		}
		
		
		}catch (Exception e) {
			System.out.println("--------->"+e.getMessage());
			e.printStackTrace();
		}
		*/
		

	}

}
