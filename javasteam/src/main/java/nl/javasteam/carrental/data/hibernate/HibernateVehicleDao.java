package nl.javasteam.carrental.data.hibernate;

import java.util.Date;
import java.util.List;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.Vehicle;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

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

	@SuppressWarnings("unchecked")
	public List<Vehicle> listAvailable(Date fromDate, Date toDate,
			Integer[] weight, Integer depthCentimeters,
			Integer heightCentimeters, Integer widthCentimeters,
			String registration, Integer minPrice, Integer maxPrice) {
		Criteria criteria = getSession().createCriteria(Vehicle.class);

		// date filter
		if (fromDate != null && toDate != null) {
			criteria.createAlias("vehiclerentalcontract",
					"vehiclerentalcontract").add(
					Restrictions.and(Restrictions.le(
							"vehiclerentalcontract.startDate", toDate),
							Restrictions.ge("vehiclerentalcontract.endDate",
									fromDate))).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		}
		if (fromDate != null && toDate == null) {
			criteria.createAlias("vehiclerentalcontract",
					"vehiclerentalcontract").add(
					Restrictions
							.ge("vehiclerentalcontract.startDate", fromDate));
		}
		if (fromDate == null && toDate != null) {
			criteria.createAlias("vehiclerentalcontract",
					"vehiclerentalcontract").add(
					Restrictions.le("vehiclerentalcontract.endDate", toDate));
		}

		// weight filter
		if (weight != null && weight.length > 0) {
			Integer minWeight = weight[0];
			Integer maxWeight = weight[1];

			if (minWeight > 0 && maxWeight > 0) {
				criteria.add(Restrictions.and(
						Restrictions.le("maxCargoWeightKilogram", maxWeight),
						Restrictions.ge("maxCargoWeightKilogram", minWeight)));
			}
		}

		// dimension filter
		if (depthCentimeters != null && depthCentimeters > 0) {
			criteria.add(Restrictions.le("depthCentimeters", depthCentimeters));
		}

		if (heightCentimeters != null && heightCentimeters > 0) {
			criteria.add(Restrictions.le("heightCentimeters", depthCentimeters));
		}

		if (widthCentimeters != null && widthCentimeters > 0) {
			criteria.add(Restrictions.le("widthCentimeters", depthCentimeters));
		}

		// registration filter
		if (registration != null && registration.length() > 0) {
			String registrationQuery = "%"
					+ Vehicle.normalizeRegistration(registration) + "%";
			criteria.add(Restrictions.like("registration", registrationQuery));
		}

		// price filter
		if (minPrice > 0 && maxPrice > 0) {
			criteria.add(Restrictions.and(
					Restrictions.ge("rentalPricePerDayEuro",
							minPrice.doubleValue()),
					Restrictions.le("rentalPricePerDayEuro",
							maxPrice.doubleValue())));
		}

		List<Vehicle> vehicles = criteria.list();
		return vehicles;
	}

	public List<Vehicle> listAvailable(Date fromDate, Date todate,
			Integer[] weight, Integer depthCentimeters,
			Integer heightCentimeters, Integer widthCentimeters,
			String registration) {
		// TODO Auto-generated method stub
		return null;
	}
}
