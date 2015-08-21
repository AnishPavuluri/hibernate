package mappings;

/**
 * LLoginhistory entity. @author MyEclipse Persistence Tools
 */

public class LLoginhistory implements java.io.Serializable {

	// Fields

	private Integer id;
	private LUser LUser;
	private String date;

	// Constructors

	/** default constructor */
	public LLoginhistory() {
	}

	/** full constructor */
	public LLoginhistory(LUser LUser, String date) {
		this.LUser = LUser;
		this.date = date;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LUser getLUser() {
		return this.LUser;
	}

	public void setLUser(LUser LUser) {
		this.LUser = LUser;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}