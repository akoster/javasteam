package nl.javasteam.carrental.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionOfElements;

/**
 * A vehiclePolicy
 * 
 * @author mlapre
 */
@Entity
public class VehiclePolicy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String vehiclePolicyBusinessId;
	@Enumerated(EnumType.STRING)
	private VehicleType vehicleType;
	private int minimumAgeYears;
	private int minimumDriversExperienceYears;
	@CollectionOfElements()
	@Enumerated(EnumType.STRING)	
	private List<DriversLicenseType> allowedDriversLicenseTypes;

	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getVehiclePolicyBusinessId(){
		return vehiclePolicyBusinessId;
	}
	
	public void setVehiclePolicyBusinessId(String vehiclePolicyBusinessId){
		this.vehiclePolicyBusinessId = vehiclePolicyBusinessId;
	}
	
	public VehicleType getVehicleType(){
		return vehicleType;
	}
	
	public void setVehicleType(VehicleType vehicleType){
		this.vehicleType = vehicleType;
	}
	
	public List<DriversLicenseType> getAllowedDriversLicenseTypes(){
		return allowedDriversLicenseTypes;
	}
	
	public void setAllowedDriversLicenseTypes(List<DriversLicenseType> allowedDriversLicenseTypes) {
		this.allowedDriversLicenseTypes = allowedDriversLicenseTypes;
	}
		
	public int getMinimumAgeYears(){
		return minimumAgeYears;
	}
	
	public void setMinimumAgeYears(int minimumAgeYears){
		this.minimumAgeYears = minimumAgeYears;
	}
	
	public int getMinimumDriversExperienceYears() {
		return minimumDriversExperienceYears;
	}
	
	public void setMinimumDriversExperienceYears(int minimumDriversExperienceYears){
		this.minimumDriversExperienceYears = minimumDriversExperienceYears;
	}
}
