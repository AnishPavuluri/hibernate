package action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;

import util.SessionUtil;

import com.opensymphony.xwork2.ActionSupport;

import dto.Customer;
import dto.Travelers;

public class CustomerAction extends ActionSupport{
	
	private Integer id;
	private Customer customer;
	private List<Travelers> travelers;
	
	public String getCustomer(){
		Session session = SessionUtil.getSession();
		customer = (Customer) session.load(Customer.class, id);
		travelers = new ArrayList<Travelers>();
		for(Travelers t:customer.getTravelerses()){
			travelers.add(t);
		}
		Collections.sort(travelers, new Comparator<Travelers>() {
			@Override
			public int compare(Travelers o1, Travelers o2) {
				return o1.getPassengerType().compareTo(o2.getPassengerType());
			}
			
		});
		return SUCCESS;
	}

	public List<Travelers> getTravelers() {
		return travelers;
	}

	public void setTravelers(List<Travelers> travelers) {
		this.travelers = travelers;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
