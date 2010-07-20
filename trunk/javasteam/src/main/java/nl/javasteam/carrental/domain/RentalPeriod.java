package nl.javasteam.carrental.domain;

import java.util.Date;

import javax.persistence.Embeddable;

/**
 * A rentalPeriod of a VehicleRentalContract
 * 
 * @author mlapre
 */
@Embeddable
public class RentalPeriod {

	private Date startDate;
	private Date endDate;


	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
