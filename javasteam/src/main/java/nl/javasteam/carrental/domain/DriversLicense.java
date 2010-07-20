package nl.javasteam.carrental.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionOfElements;

/**
 * DriversLicense
 * 
 * @author mlapre
 */
@Entity
public class DriversLicense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int number;
	private Date acquisitionDate;
	@CollectionOfElements()
	@Enumerated(EnumType.STRING)
	// TODO (ako) find out how this works
	//@Type(type = "nl.javasteam.carrental.domain.DriversLicenseTypeUserType", parameters = @Parameter(name = "type", value = "DriversLicenseType")) 
	private List<DriversLicenseType> type;

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
		
	public List<DriversLicenseType> getType(){
		return type;
	}
	
	public void setType(List<DriversLicenseType> type){
		this.type = type;
	}	
	
	public int getNumber(){
		return number;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public Date getAcquisitionDate(){
		return acquisitionDate;
	}
	
	public void setAcquisitionDate(Date acquisitionDate){
		this.acquisitionDate = acquisitionDate;
	}
}
