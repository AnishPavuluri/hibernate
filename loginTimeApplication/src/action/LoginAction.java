package action;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDetailsDao;
import dao.UserDao;
import dto.LoginDetails;
import dto.User;

public class LoginAction extends ActionSupport{
	private User user;
	private Date date;
	
	public String loginUser(){
		UserDao userDao = new UserDao();
		LoginDetailsDao loginDetailsDao = new LoginDetailsDao();
		User user1 = userDao.findUserByName(user.getUserName());
		if(user1 == null){
			LoginDetails loginDetails = new LoginDetails();
			loginDetails.setDate(Calendar.getInstance().getTime());
			loginDetails.setUser(user);
			userDao.saveUser(user);
			loginDetailsDao.saveLoginDetails(loginDetails);
		}else{
			List<LoginDetails> ll = loginDetailsDao.getLoginDetails();
			if(!ll.isEmpty()){
				for(LoginDetails l : ll){
					if(l.getUser().getUserName().equals(user.getUserName()))
						date = l.getDate();
				}
			}
			LoginDetails loginDetails = new LoginDetails();
			loginDetails.setDate(Calendar.getInstance().getTime());
			loginDetails.setUser(user1);
			loginDetailsDao.updatLoginDetails(loginDetails);
		}
		
		return SUCCESS;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
