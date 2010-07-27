package nl.javasteam.carrental.service.impl;

import java.util.List;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.CargoSpace;
import nl.javasteam.carrental.domain.Customer;
import nl.javasteam.carrental.domain.DriversLicenseType;
import nl.javasteam.carrental.domain.RentalPeriod;
import nl.javasteam.carrental.domain.Vehicle;
import nl.javasteam.carrental.service.VehicleService;

public class VehicleServiceImpl implements VehicleService {

	private VehicleDao vehicleDao;

	public void setVehicleDao(VehicleDao vehicleDao) {
		this.vehicleDao = vehicleDao;
	}

	public List<Vehicle> listAvailable(Customer customer,
			RentalPeriod rentalPeriod, CargoSpace minCargoSpace,
			int minCargoWeightKilogram, double maxRentalPrice) {

		// TODO check for null values
		List<DriversLicenseType> driversLicenceType = customer.getDriversLicense().getType();

		// TODO convert customer.getBirthDate() to an age
		int driverAge = 40;

		// TODO convert customer.getDriversLicense().getAcquisitionDate() to
		// experience years
		int driverExperienceYears = 0;

		return vehicleDao.listAvailable(rentalPeriod, minCargoWeightKilogram,
				minCargoSpace, maxRentalPrice, driversLicenceType, driverAge,
				driverExperienceYears);
	}

}
