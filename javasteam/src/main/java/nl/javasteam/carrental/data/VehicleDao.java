package nl.javasteam.carrental.data;

import java.util.Date;
import java.util.List;

import nl.javasteam.carrental.domain.Vehicle;

/**
 * Data access object for the Vehicle entity
 * 
 * @author Adriaan
 */
public interface VehicleDao extends BaseDao<Vehicle, Long> {

	// Provided by BaseDao:
	// --Enter new vehicle
	// --Find vehicle by id
	// --Update vehicle
	// --List all vehicles
	
	/**
	 * Lists available vehicles by customer criteria:
	 * 
	 * @param rentalPeriod
	 *            RentalPeriod
	 * @param minCargoWeightKilogram
	 * @param minCargoSpace
	 *            CargoSpace
	 * @param maxRentalPrice
	 * @param driversLicenceType
	 *            DriversLicenceType
	 * @param driverAge
	 * @param driverExperienceYears
	 * @return
	 */
	List<Vehicle> listAvailable(Object rentalPeriod, int minCargoWeightKilogram,
			Object minCargoSpace, double maxRentalPrice,
			Object driversLicenceType, int driverAge, int driverExperienceYears);

	List<Vehicle> listAvailable(Date fromDate, Date todate, Integer[] weight,
			Integer depthCentimeters, Integer heightCentimeters,
			Integer widthCentimeters, String registration, Integer minPrice,
			Integer maxPrice);
}
