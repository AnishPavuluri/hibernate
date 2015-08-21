package dto;

/**
 * Travelers entity. @author MyEclipse Persistence Tools
 */

public class Travelers implements java.io.Serializable {

	// Fields

	private Integer travelerId;
	private Customer customer;
	private String travelerName;
	private String passengerType;

	// Constructors

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	/** default constructor */
	public Travelers() {
	}

	/** minimal constructor */
	public Travelers(Integer travelerId) {
		this.travelerId = travelerId;
	}

	/** full constructor */
	public Travelers(Integer travelerId, Customer customer, String travelerName) {
		this.travelerId = travelerId;
		this.customer = customer;
		this.travelerName = travelerName;
	}

	// Property accessors

	public Integer getTravelerId() {
		return this.travelerId;
	}

	public void setTravelerId(Integer travelerId) {
		this.travelerId = travelerId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getTravelerName() {
		return this.travelerName;
	}

	public void setTravelerName(String travelerName) {
		this.travelerName = travelerName;
	}

}