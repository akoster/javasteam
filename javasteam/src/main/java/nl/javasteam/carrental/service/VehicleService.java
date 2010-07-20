package nl.javasteam.carrental.service;

import java.util.List;

import nl.javasteam.carrental.domain.CargoSpace;
import nl.javasteam.carrental.domain.Customer;
import nl.javasteam.carrental.domain.RentalPeriod;
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
	List<Vehicle> listAvailable(Customer customer, RentalPeriod rentalPeriod,
			CargoSpace minCargoSpace, int minCargoWeightKilogram,
			double maxRentalPrice);
}
