package nl.javasteam.carrental.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

/**
 * A vehiclePolicy
 * 
 * @author mlapre
 */
@Entity
@TypeDef(name = DriversLicenseTypeDef.NAME, typeClass = DriversLicenseTypeDef.class)
public class VehiclePolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private VehicleType vehicleType;
	private int minimumAgeYears;
	private int minimumDriversExperienceYears;
	@CollectionOfElements()
	@Type(type = DriversLicenseTypeDef.NAME)
	private List<DriversLicenseType> allowedDriversLicenseTypes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public List<DriversLicenseType> getAllowedDriversLicenseTypes() {
		return allowedDriversLicenseTypes;
	}

	public void setAllowedDriversLicenseTypes(
			List<DriversLicenseType> allowedDriversLicenseTypes) {
		this.allowedDriversLicenseTypes = allowedDriversLicenseTypes;
	}

	public int getMinimumAgeYears() {
		return minimumAgeYears;
	}

	public void setMinimumAgeYears(int minimumAgeYears) {
		this.minimumAgeYears = minimumAgeYears;
	}

	public int getMinimumDriversExperienceYears() {
		return minimumDriversExperienceYears;
	}

	public void setMinimumDriversExperienceYears(
			int minimumDriversExperienceYears) {
		this.minimumDriversExperienceYears = minimumDriversExperienceYears;
	}
}
