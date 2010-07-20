package nl.javasteam.carrental.domain;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * A vehicleRentalContract
 * 
 * @author mlapre
 */
@Entity
public class VehicleRentalContract {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	@ManyToOne(cascade = CascadeType.ALL)
	private Vehicle vehicle;
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	@Embedded
	private RentalPeriod rentalPeriod;
	private double depositAmountEuro;
	private boolean depositAmountPayed;

		
	public Long getId() {
		return id;
	}
	
	public void getId(Long id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public RentalPeriod getRentalPeriod() {
		return rentalPeriod;
	}
	
	public void setRentalPeriod(RentalPeriod rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}
	
	public double getDepositAmountEuro() {
		return depositAmountEuro;
	}
	
	public void setDepositAmountEuro(double depositAmountEuro) {
		this.depositAmountEuro = depositAmountEuro;
	}
	
	public boolean getDepositAmountPayed() {
		return depositAmountPayed;
	}
	
	public void setDepositAmountPayed(boolean depositAmountPayed) {
		this.depositAmountPayed = depositAmountPayed;
	}
}