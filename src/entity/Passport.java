package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@Column(name="passport_number")
	String passportNumber;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(String passportNumber) {
		super();
		this.passportNumber = passportNumber;
	}
	
	@OneToOne(mappedBy = "passport")
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
