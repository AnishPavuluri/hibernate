package action;

import com.opensymphony.xwork2.ActionSupport;

public class SampleLoginAction extends ActionSupport{
	private String userName;
	private String password;
	
	public String execute(){
		if(userName.equalsIgnoreCase(password)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
