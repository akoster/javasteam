package nl.javasteam.carrental.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	@Column(name="customerBusinessId")
	private String customerBusinessId;
	
	public String getCustomerBusinessId(){
		return customerBusinessId;
	}
	
	public void setCustomerBusinessId(String customerBusinessId){
		this.customerBusinessId = customerBusinessId;
	}
	
	@Column(name="firstName")
	private String firstName;
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	@Column(name="lastName")
	private String lastName;
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	@Column(name="homeAddress")
	private String homeAddress;
	
	public String getHomeAddress(){
		return homeAddress;
	}
	
	public void setHomeAddress(String homeAddress){
		this.homeAddress = homeAddress;
	}
	
	@Column(name="phoneNumber")
	private int phoneNumber;
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setphoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	@Column(name="bankAccountNumber")
	private int bankAccountNumber;
	
	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	
	public void setBankAccountNumber(int bankAccountNumber){
		this.bankAccountNumber = bankAccountNumber;
	}
	
	@Column(name="birthDate")
	private Date birthDate;
	
	public Date getBirthDate(){
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
	
	@OneToOne()
	@JoinColumn(name="id", unique=true, nullable=false, updatable=false)
	private DriversLicense driversLicense;
	
	public DriversLicense getDriversLicense(){
		return driversLicense;
	}
	
	public void setDriversLicense(DriversLicense driversLicense){
		this.driversLicense = driversLicense;
	}
}
