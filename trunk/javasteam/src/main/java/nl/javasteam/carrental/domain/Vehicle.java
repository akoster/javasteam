package nl.javasteam.carrental.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	@Column(name="vehicleBusinessId", updatable=true, length=20, unique=true)
	private String vehicleBusinessId;
	
	public String getVehicleBusinessId() {
		return vehicleBusinessId;
	}
	
	public void setVehicleBusinessId(String vehicleBusinessId) {
		this.vehicleBusinessId = vehicleBusinessId;
	}
	
	@Column(name="maxCargoWeightKiloGram", updatable=true, length=6, unique=false)
	private int maxCargoWeightKiloGram;
	
	public int getMaxCargoWeightKiloGram() {
		return maxCargoWeightKiloGram;
	}
	
	public void setMaxCargoWeightKiloGram(int maxCargoWeightKiloGram) {
		this.maxCargoWeightKiloGram = maxCargoWeightKiloGram;
	}
	
	@Column(name="rentalPricePerDayEuro", updatable=true, unique=false)
	private double rentalPricePerDayEuro;
	
	public double getRentalPricePerDayEuro() {
		return rentalPricePerDayEuro;
	}
	
	public void setRentalPricePerDayEuro(double rentalPricePerDayEuro){
		this.rentalPricePerDayEuro = rentalPricePerDayEuro;
	}
	
	
}
