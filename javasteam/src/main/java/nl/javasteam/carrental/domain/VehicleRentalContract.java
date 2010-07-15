package nl.javasteam.carrental.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class VehicleRentalContract {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void getId(Long id) {
		this.id = id;
	}
	
	@Column(name="vehicleRentalContractBusinessId")
	private String vehicleRentalContractBusinessId;
	
	public String getVehicleRentalContractBusinessId() {
		return vehicleRentalContractBusinessId;
	}
	
	public void setVehicleRentalContractBusinessId(String vehicleRentalContractBusinessId) {
		this.vehicleRentalContractBusinessId = vehicleRentalContractBusinessId;
	}
	
	@OneToOne(optional=false)
	@JoinColumn(name="id", unique=true, nullable=false, updatable=false)
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@OneToOne(optional=false)
	@JoinColumn(name="id", unique=true, nullable=false, updatable=false)
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@OneToOne(optional=false)
	@JoinColumn(name="id", unique=true, nullable=false, updatable=false)
	private RentalPeriod rentalPeriod;
	
	public RentalPeriod getRentalPeriod() {
		return rentalPeriod;
	}
	
	public void setRentalPeriod(RentalPeriod rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}
	
	@Column(name="depositAmountEuro")
	private double depositAmountEuro;
	
	public double getDepositAmountEuro() {
		return depositAmountEuro;
	}
	
	public void setDepositAmountEuro(double depositAmountEuro) {
		this.depositAmountEuro = depositAmountEuro;
	}
	
	@Column(name="depositAmountPayed")
	private boolean depositAmountPayed;
	
	public boolean getDepositAmountPayed() {
		return depositAmountPayed;
	}
	
	public void setDepositAmountPayed(boolean depositAmountPayed) {
		this.depositAmountPayed = depositAmountPayed;
	}
}
