package nl.javasteam.carrental.service;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.Vehicle;
import nl.javasteam.carrental.service.impl.VehicleServiceImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * This class demonstrates writing unit tests with the help of a mocking
 * framework, in this case we use Mockito.
 */
public class VehicleServiceTest {

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

		// tell the mock vehicleDao to always return the vehicles
		stub(
				vehicleDao.listAvailable(anyObject(), anyInt(), anyObject(),
						anyDouble(), anyObject(), anyInt(), anyInt()))
				.toReturn(vehicles);

		// call the VehicleService
		List<Vehicle> resultList = instance.listAvailable(null, null, null,
				1500, 200.00);
		Vehicle result = resultList.get(0);

		// check that the correct vehicle is returned
		Assert.assertEquals(vehicle.getId(), result.getId());
	}
}
