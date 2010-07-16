package nl.javasteam.carrental.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
	private String vehicleBusinessId;
	private int maxCargoWeightKiloGram;
	@Embedded
	private CargoSpace cargoSpace;
	private double rentalPricePerDayEuro;
	@OneToOne(cascade = CascadeType.ALL)
	private VehiclePolicy vehiclePolicy;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
		
	public String getVehicleBusinessId() {
		return vehicleBusinessId;
	}
	
	public void setVehicleBusinessId(String vehicleBusinessId) {
		this.vehicleBusinessId = vehicleBusinessId;
	}
	
	public int getMaxCargoWeightKiloGram() {
		return maxCargoWeightKiloGram;
	}
	
	public void setMaxCargoWeightKiloGram(int maxCargoWeightKiloGram) {
		this.maxCargoWeightKiloGram = maxCargoWeightKiloGram;
	}
	
	public CargoSpace getCargoSpace() {
		return cargoSpace;
	}
	
	public void setCargoSpace(CargoSpace cargoSpace) {
		this.cargoSpace = cargoSpace;
	}
	
	public double getRentalPricePerDayEuro() {
		return rentalPricePerDayEuro;
	}
	
	public void setRentalPricePerDayEuro(double rentalPricePerDayEuro){
		this.rentalPricePerDayEuro = rentalPricePerDayEuro;
	}
		
	public VehiclePolicy getVehiclePolicy(){
		return vehiclePolicy;
	}
	
	public void setVehiclePolicy(VehiclePolicy vehiclePolicy){
		this.vehiclePolicy = vehiclePolicy;
	}
}
