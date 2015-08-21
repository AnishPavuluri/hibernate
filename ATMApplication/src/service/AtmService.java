package service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import model.AtmAccount;
import model.Ministataement;

import org.springframework.stereotype.Service;

import util.TimeComparator;

import dao.AtmaccountDAO;
import dao.MinistataementDAO;

@Service("atmService")
public class AtmService {
	private AtmaccountDAO atmaccountDAO;
	private MinistataementDAO ministataementDAO;
	
	public Integer findBalance(Integer accno){
		AtmAccount atmAccount=(AtmAccount)atmaccountDAO.findById(accno);
		return atmAccount.getBalance();
	}
	
	public boolean withDraw(AtmAccount atmAccount){
		AtmAccount a = (AtmAccount)atmaccountDAO.findById(atmAccount.getAccno());
		Ministataement m1 = new Ministataement();
		m1.setAccno(atmAccount.getAccno());
		m1.setBalance(atmAccount.getBalance());
		m1.setTransactionDate(Calendar.getInstance().getTime());
		m1.setTransaction("debit");
		if(a.getBalance() >= atmAccount.getBalance()){
			atmAccount.setBalance(a.getBalance() - atmAccount.getBalance());
			atmaccountDAO.merge(atmAccount);
			ministataementDAO.save(m1);
			System.out.println("SUCCESS");
			return true;
		}
		else{
			return true;
		}
	}
	
	public boolean transferFunds(AtmAccount from,AtmAccount to,Integer balance){
		AtmAccount a = (AtmAccount)atmaccountDAO.findById(from.getAccno());
		AtmAccount b = (AtmAccount)atmaccountDAO.findById(to.getAccno());
		Ministataement m1 = new Ministataement();
		Ministataement m2 = new Ministataement();
		m1.setAccno(from.getAccno());
		m1.setBalance(balance);
		m1.setTransaction("debit");
		m1.setTransactionDate(Calendar.getInstance().getTime());
		m2.setAccno(to.getAccno());
		m2.setBalance(balance);
		m2.setTransaction("credit");
		m2.setTransactionDate(Calendar.getInstance().getTime());
		if(a.getBalance() >= balance){
			from.setBalance(a.getBalance() - balance);
			to.setBalance(b.getBalance() + balance);
			atmaccountDAO.merge(from);
			atmaccountDAO.merge(to);
			ministataementDAO.save(m1);
			ministataementDAO.save(m2);
			return true;
		}
		else{
			return false;
		}
	}
	
	public List<Ministataement> miniStatement(Integer accNo){
		List<Ministataement> mini = ministataementDAO.findByProperty("accno", accNo ); 
		//TODO return fixed records
		TimeComparator t = new TimeComparator();
		Collections.sort(mini, t);
		System.out.println("mini------->"+mini);
		if(mini.size()>4){
			System.out.println("############");
			return mini.subList(0, 4);
		}
		else{
			System.out.println("*******");
			return mini;
		}
		
	}

	@Resource
	public void setAtmaccountDAO(AtmaccountDAO atmaccountDAO) {
		this.atmaccountDAO = atmaccountDAO;
	}

	@Resource
	public void setMinistataementDAO(MinistataementDAO ministataementDAO) {
		this.ministataementDAO = ministataementDAO;
	}
	
	
	
		

}
