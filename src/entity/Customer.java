package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@Column(name="customer_name")
	String name;
	
	public Customer() {
		
	}
	public Customer(String name,Passport passport) {
		super();
		this.name = name;
		this.passport = passport;
	}
	@OneToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name="passport_id",unique=true)
	Passport passport;
	
}
