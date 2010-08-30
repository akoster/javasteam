package nl.javasteam.carrental.service;

import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.Customer;
import nl.javasteam.carrental.domain.DriversLicense;
import nl.javasteam.carrental.domain.DriversLicenseType;
import nl.javasteam.carrental.domain.Vehicle;
import nl.javasteam.carrental.service.impl.VehicleServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * This class demonstrates writing unit tests with the help of a mocking
 * framework, in this case we use Mockito.
 */
public class VehicleServiceTest {

	private static final Logger LOG = Logger.getLogger(VehicleServiceTest.class);
	
	private static final long ONE_YEAR_IN_MILLISECONDS = (long) (365.242199 * 24 * 60 * 60 * 1000);

	private VehicleDao vehicleDao;
	private VehicleService instance;

	@Before
	public void setUp() {

		// create a 'mock' VehicleDao controlled by Mockito
		vehicleDao = mock(VehicleDao.class);

		// set ('inject') the vehicleDao dependency in the service
		// implementation
		VehicleServiceImpl serviceImpl = new VehicleServiceImpl();
		serviceImpl.setVehicleDao(vehicleDao);
		instance = serviceImpl;
	}

	@Test
	public void test() {

		// create list of values to return from vehicleDao
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle = new Vehicle();
		vehicle.setId(1234L);
		vehicles.add(vehicle);

		Customer customer = new Customer();
		long birthDateTimestamp = 2648267487L;
		Date birthDate = new Date(birthDateTimestamp);
		customer.setBirthDate(birthDate);
		DriversLicense driversLicense = new DriversLicense();
		List<DriversLicenseType> types = new ArrayList<DriversLicenseType>();
		types.add(DriversLicenseType.B);
		driversLicense.setTypes(types);
		customer.setDriversLicense(driversLicense);
   
		int driverAge = (int) ((System.currentTimeMillis() - birthDateTimestamp) / ONE_YEAR_IN_MILLISECONDS);
		
		LOG.debug("birthDate=" + birthDate + " driverAge=" + driverAge);
		// tell the mock vehicleDao to always return the vehicles
		// this is called 'stubbing'
		stub(
				vehicleDao.listAvailable(anyObject(), anyInt(), anyObject(),
						anyDouble(), anyObject(), eq(driverAge), anyInt()))
				.toReturn(vehicles);

		// call the VehicleService with arbitrary arguments
		// it should call our VehicleDao's listAvailable method and
		// return the obtained list of vehicles
		List<Vehicle> resultList = instance.listAvailable(customer, null, null,
				1500, 200.00);
		
		verify(vehicleDao, times(1)).listAvailable(anyObject(), anyInt(), anyObject(),
				anyDouble(), anyObject(), eq(driverAge), anyInt());
		
		// check that we got the expected number of vehicles back
		Assert.assertEquals(1, resultList.size());
		// get the first vehicle
		Vehicle result = resultList.get(0);
		// check that the expected vehicle is returned
		Assert.assertEquals(vehicle.getId(), result.getId());
	}
}
