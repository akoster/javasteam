package nl.javasteam.carrental.service;

import java.util.List;

import nl.javasteam.carrental.domain.Vehicle;

/**
 * Service for Vehicle-related actions
 * 
 * @author Adriaan
 */
public interface VehicleService {

	/**
	 * Lists the available Vehicles
	 * 
	 * @param customer
	 *            Customer
	 * @param rentalPeriod
	 *            RentalPeriod
	 * @param minCargoSpace
	 * @param minCargoWeightKilogram
	 * @param maxRentalPrice
	 * @return
	 */
	List<Vehicle> listAvailable(Object customer, Object rentalPeriod,
			Object minCargoSpace, int minCargoWeightKilogram,
			double maxRentalPrice);
}
