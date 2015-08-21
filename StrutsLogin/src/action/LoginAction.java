package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String userName;
	private String password;
	
	public String execute(){
		System.out.println("########"+userName+"--"+password);
		if(userName.equalsIgnoreCase(password)){
			System.out.println("success");
			return SUCCESS;
		}else {
			System.out.println("error");
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
