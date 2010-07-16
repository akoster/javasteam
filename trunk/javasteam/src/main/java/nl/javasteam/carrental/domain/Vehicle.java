package nl.javasteam.carrental.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * A vehicle which can be rented
 * 
 * @author Adriaan
 */
@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="vehicleBusinessId")
	private String vehicleBusinessId;
	
	public String getVehicleBusinessId() {
		return vehicleBusinessId;
	}
	
	public void setVehicleBusinessId(String vehicleBusinessId) {
		this.vehicleBusinessId = vehicleBusinessId;
	}
	
	@Column(name="maxCargoWeightKiloGram")
	private int maxCargoWeightKiloGram;
	
	public int getMaxCargoWeightKiloGram() {
		return maxCargoWeightKiloGram;
	}
	
	public void setMaxCargoWeightKiloGram(int maxCargoWeightKiloGram) {
		this.maxCargoWeightKiloGram = maxCargoWeightKiloGram;
	}
	
	@OneToOne(targetEntity=CargoSpace.class)
	private CargoSpace cargoSpace;
	
	public CargoSpace getCargoSpace() {
		return cargoSpace;
	}
	
	public void setCargoSpace(CargoSpace cargoSpace) {
		this.cargoSpace = cargoSpace;
	}
	
	@Column(name="rentalPricePerDayEuro")
	private double rentalPricePerDayEuro;
	
	public double getRentalPricePerDayEuro() {
		return rentalPricePerDayEuro;
	}
	
	public void setRentalPricePerDayEuro(double rentalPricePerDayEuro){
		this.rentalPricePerDayEuro = rentalPricePerDayEuro;
	}
	
	@OneToOne(targetEntity=VehiclePolicy.class)
	private VehiclePolicy vehiclePolicy;
	
	public VehiclePolicy getVehiclePolicy(){
		return vehiclePolicy;
	}
	
	public void setVehiclePolicy(VehiclePolicy vehiclePolicy){
		this.vehiclePolicy = vehiclePolicy;
	}
}
