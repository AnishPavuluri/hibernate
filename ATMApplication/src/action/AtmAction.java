package action;
import java.util.List;
import javax.annotation.Resource;
import model.AtmAccount;
import model.Ministataement;
import service.AtmService;
import com.opensymphony.xwork2.ActionSupport;
public class AtmAction extends ActionSupport {
	private AtmService atmService;
	private Integer accNo;
	private Integer toAccNo;
	private Integer balance;
	private List<Ministataement> ministataements;
	
	public String execute(){
		return SUCCESS;
	}

	public String balanceEnquiry(){
		System.out.println("################"+accNo);
		balance = atmService.findBalance(accNo);
		if(null != balance){
			System.out.println("######## success ########33");
			return SUCCESS;
		}
		else{
			System.out.println("######### error ############");
			return ERROR;
		}
	}
	
	public String toGetMiniStatement(){
		System.out.println("@@@@@@@@@@@@@@"+accNo);
		ministataements = atmService.miniStatement(accNo);
		balance = atmService.findBalance(accNo);
		return SUCCESS;
	}
	
	public String withDraw(){
		AtmAccount atmAccount = new AtmAccount();
		atmAccount.setAccno(accNo);
		atmAccount.setBalance(balance);
		atmService.withDraw(atmAccount);
		return SUCCESS;
	}
	
	public String trasferFunds(){
		AtmAccount from = new AtmAccount();
		AtmAccount to = new AtmAccount();
		from.setAccno(accNo);
		to.setAccno(toAccNo);
		atmService.transferFunds(from, to, balance);
		return SUCCESS;
	}
	
	public String transfer(){
		return SUCCESS;
	}
	
	public String draw(){
		return SUCCESS;
	}
	
	public Integer getAccNo() {
		return accNo;
	}


	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	
	
	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	

	public List<Ministataement> getMinistataements() {
		return ministataements;
	}

	public void setMinistataements(List<Ministataement> ministataements) {
		this.ministataements = ministataements;
	}
	
	public Integer getToAccNo() {
		return toAccNo;
	}

	public void setToAccNo(Integer toAccNo) {
		this.toAccNo = toAccNo;
	}

	@Resource
	public void setAtmService(AtmService atmService) {
		this.atmService = atmService;
	}
	
	

}
