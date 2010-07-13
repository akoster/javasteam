package nl.javasteam.carrental.data.hibernate;

import java.util.List;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.Vehicle;

public class HibernateVehicleDao extends HibernateBaseDao<Vehicle, Long>
		implements VehicleDao {

	public HibernateVehicleDao() {
		super(Vehicle.class);
	}

	@SuppressWarnings("unchecked")
	// TODO Object should be replaced with appropriate classes
	public List<Vehicle> listAvailable(Object rentalPeriod,
			int minCargoWeightKilogram, Object minCargoSpace,
			double maxRentalPrice, Object driversLicenceType, int driverAge,
			int driverExperienceYears) {

		// TODO Extend HQL (Hibernate Query Language) query
		List<Vehicle> availableVehicles = getHibernateTemplate().find(
				"from Vehicle where maxCargoWeightKilogram > ?",
				new Object[] { minCargoWeightKilogram });
		return availableVehicles;
	}
}
