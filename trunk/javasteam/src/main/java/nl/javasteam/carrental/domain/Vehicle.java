package nl.javasteam.carrental.domain;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private String code;
	private int maxCargoWeightKilogram;
	@Embedded
	private CargoSpace cargoSpace;
	private double rentalPricePerDayEuro;
	@ManyToOne(cascade = CascadeType.ALL)
	private VehiclePolicy vehiclePolicy;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
		
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public int getMaxCargoWeightKilogram() {
		return maxCargoWeightKilogram;
	}
	
	public void setMaxCargoWeightKilogram(int maxCargoWeightKilogram) {
		this.maxCargoWeightKilogram = maxCargoWeightKilogram;
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
