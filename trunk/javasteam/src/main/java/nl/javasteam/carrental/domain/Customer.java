package nl.javasteam.carrental.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Customer
 * 
 * @author mlapre
 */
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private String firstName;
	private String lastName;
	private String homeAddress;
	private String phoneNumber;
	private int bankAccountNumber;
	private Date birthDate;
	@OneToOne(cascade = CascadeType.ALL)
	private DriversLicense driversLicense;


	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
		
	public String getCode(){
		return code;
	}
	
	public void setCode(String code){
		this.code = code;
	}
		
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getHomeAddress(){
		return homeAddress;
	}
	
	public void setHomeAddress(String homeAddress){
		this.homeAddress = homeAddress;
	}
		
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setphoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	
	public void setBankAccountNumber(int bankAccountNumber){
		this.bankAccountNumber = bankAccountNumber;
	}
		
	public Date getBirthDate(){
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
	
	public DriversLicense getDriversLicense(){
		return driversLicense;
	}
	
	public void setDriversLicense(DriversLicense driversLicense){
		this.driversLicense = driversLicense;
	}
}
