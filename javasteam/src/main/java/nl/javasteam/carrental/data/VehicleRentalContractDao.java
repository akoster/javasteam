package nl.javasteam.carrental.data;

import java.util.Date;
import java.util.List;

import nl.javasteam.carrental.domain.VehicleRentalContract;

/**
 * Data access object for the Contract entity
 * 
 * @author Bouke
 */
public interface VehicleRentalContractDao extends BaseDao<VehicleRentalContract, Long> {

	/**
	 * Lists active contracts by criteria:
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
	List<VehicleRentalContract> list(Long contractID, String customerNameOrID, Date date, String vehicleDescriptionOrRegistration);
}
