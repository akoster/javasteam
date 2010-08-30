package nl.javasteam.carrental.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

/**
 * DriversLicense
 * 
 * @author mlapre
 */
@Entity
@TypeDef(name = DriversLicenseTypeDef.NAME, typeClass = DriversLicenseTypeDef.class)
public class DriversLicense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int number;
	private Date acquisitionDate;
	@CollectionOfElements()
	@Type(type = DriversLicenseTypeDef.NAME)
	private List<DriversLicenseType> types;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<DriversLicenseType> getTypes() {
		if (types == null) {
			types = new ArrayList<DriversLicenseType>();
		}
		return types;
	}

	public void setTypes(List<DriversLicenseType> type) {
		this.types = type;
	}

	public void addType(DriversLicenseType type) {
		getTypes().add(type);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}
}
