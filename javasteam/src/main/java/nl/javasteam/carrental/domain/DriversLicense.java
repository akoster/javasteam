package nl.javasteam.carrental.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CollectionOfElements;

@Entity
public class DriversLicense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="driversLicenseType")
	private List<DriversLicenseType> driversLicenseType;
	
	public List<DriversLicenseType> getDriversLicenseType(){
		return driversLicenseType;
	}
	
	public void setDriversLicenseType(List<DriversLicenseType> driversLicenseType){
		this.driversLicenseType = driversLicenseType;
	}*/
	
	@Column(name="driversLicenseNumber")
	private int driversLicenseNumber;
	
	public int getDriversLicenseNumber(){
		return driversLicenseNumber;
	}
	
	public void setDriversLicenseNumber(int driversLicenseNumber){
		this.driversLicenseNumber = driversLicenseNumber;
	}
	
	@Column(name="acquisitionDate")
	private Date acquisitionDate;
	
	public Date getAcquisitionDate(){
		return acquisitionDate;
	}
	
	public void setAcquisitionDate(Date acquisitionDate){
		this.acquisitionDate = acquisitionDate;
	}
}
