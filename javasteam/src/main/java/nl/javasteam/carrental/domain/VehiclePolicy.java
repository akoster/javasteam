package nl.javasteam.carrental.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehiclePolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	@Column(name="vehicleType", length=10, updatable=true, nullable=false)
	private VehicleType vehicleType;
	
	public VehicleType getVehicleType(){
		return vehicleType;
	}
	
	public void setVehicleType(VehicleType vehicleType){
		this.vehicleType = vehicleType;
	}
		
	@Column(name="minimumAgeYears", length=2, updatable=true, nullable=false)
	private int minimumAgeYears;
	
	public int getMinimumAgeYears(){
		return minimumAgeYears;
	}
	
	public void setMinimumAgeYears(int minimumAgeYears){
		this.minimumAgeYears = minimumAgeYears;
	}
	
	@Column(name="minimumDriversExperienceYears", length=2, updatable=true, nullable=false)
	private int minimumDriversExperienceYears;
	
	public int getMinimumDriversExperienceYears() {
		return minimumDriversExperienceYears;
	}
	
	public void setMinimumDriversExperienceYears(int minimumDriversExperienceYears){
		this.minimumDriversExperienceYears = minimumDriversExperienceYears;
	}	
}
