package mappings;

import java.util.HashSet;
import java.util.Set;

/**
 * LUser entity. @author MyEclipse Persistence Tools
 */

public class LUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;
	private Set LLoginhistories = new HashSet(0);

	// Constructors

	/** default constructor */
	public LUser() {
	}

	/** full constructor */
	public LUser(String userName, String password, Set LLoginhistories) {
		this.userName = userName;
		this.password = password;
		this.LLoginhistories = LLoginhistories;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getLLoginhistories() {
		return this.LLoginhistories;
	}

	public void setLLoginhistories(Set LLoginhistories) {
		this.LLoginhistories = LLoginhistories;
	}

}