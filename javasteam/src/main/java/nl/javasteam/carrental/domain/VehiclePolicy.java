package nl.javasteam.carrental.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionOfElements;

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
	
	@Column(name="vehiclePolicyBusinessId")
	private String vehiclePolicyBusinessId;
	
	public String getVehiclePolicyBusinessId(){
		return vehiclePolicyBusinessId;
	}
	
	public void setVehiclePolicyBusinessId(String vehiclePolicyBusinessId){
		this.vehiclePolicyBusinessId = vehiclePolicyBusinessId;
	}
	
	/*@Column(name="vehicleType")
	private VehicleType vehicleType;
	
	public VehicleType getVehicleType(){
		return vehicleType;
	}
	
	public void setVehicleType(VehicleType vehicleType){
		this.vehicleType = vehicleType;
	}*/
	
	/*@Column(name="allowedDriversLicenseTypes")
	private List<DriversLicenseType> allowedDriversLicenseTypes;
	
	public List<DriversLicenseType> getAllowedDriversLicenseTypes(){
		return allowedDriversLicenseTypes;
	}
	
	public void setAllowedDriversLicenseTypes(List<DriversLicenseType> allowedDriversLicenseTypes) {
		this.allowedDriversLicenseTypes = allowedDriversLicenseTypes;
	}*/
	
	@Column(name="minimumAgeYears")
	private int minimumAgeYears;
	
	public int getMinimumAgeYears(){
		return minimumAgeYears;
	}
	
	public void setMinimumAgeYears(int minimumAgeYears){
		this.minimumAgeYears = minimumAgeYears;
	}
	
	@Column(name="minimumDriversExperienceYears")
	private int minimumDriversExperienceYears;
	
	public int getMinimumDriversExperienceYears() {
		return minimumDriversExperienceYears;
	}
	
	public void setMinimumDriversExperienceYears(int minimumDriversExperienceYears){
		this.minimumDriversExperienceYears = minimumDriversExperienceYears;
	}	
}
