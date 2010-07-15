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
	
	@Column(name="minimumAgeYears", length=2, updatable=true, insertable=false)
	private int minimumAgeYears;
	
	public int setMinimumAgeYears(){
		return minimumAgeYears;
	}
	
	public void getMinimumAgeYears(int minimumAgeYears){
		this.minimumAgeYears = minimumAgeYears;
	}
	
	@Column(name="minimumDriversExperienceYears", length=2, updatable=true, insertable=false)
	private int minimumDriversExperienceYears;
	
	public int setMinimumDriversExperienceYears() {
		return minimumDriversExperienceYears;
	}
	
	public void setMinimumDriversExperienceYears(int minimumDriversExperienceYears){
		this.minimumDriversExperienceYears = minimumDriversExperienceYears;
	}	
}
