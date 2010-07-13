package nl.javasteam.carrental.service.impl;

import java.util.List;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.Vehicle;
import nl.javasteam.carrental.service.VehicleService;

public class VehicleServiceImpl implements VehicleService {

	private VehicleDao vehicleDao;

	public void setVehicleDao(VehicleDao vehicleDao) {
		this.vehicleDao = vehicleDao;
	}

	public List<Vehicle> listAvailable(Object customer,
			Object rentalPeriod, Object minCargoSpace,
			int minCargoWeightKilogram, double maxRentalPrice) {

		// TODO customer.getDriversLicence().getType()
		Object driversLicenceType = null;

		// TODO convert customer.getBirthDate() to an age
		int driverAge = 0;

		// TODO convert customer.getDriversLicense().getAcquisitionDate() to
		// experience years
		int driverExperienceYears = 0;

		return vehicleDao.listAvailable(rentalPeriod, minCargoWeightKilogram,
				minCargoSpace, maxRentalPrice, driversLicenceType, driverAge,
				driverExperienceYears);
	}

}
