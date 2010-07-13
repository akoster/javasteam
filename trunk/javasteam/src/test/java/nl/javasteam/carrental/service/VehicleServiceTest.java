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
		// this is called 'stubbing'
		stub(
				vehicleDao.listAvailable(anyObject(), anyInt(), anyObject(),
						anyDouble(), anyObject(), anyInt(), anyInt()))
				.toReturn(vehicles);

		// call the VehicleService with arbitrary arguments
		// it should call our VehicleDao's listAvailable method and
		// return the obtained list of vehicles
		List<Vehicle> resultList = instance.listAvailable(null, null, null,
				1500, 200.00);
		// check that we got the expected number of vehicles back
		Assert.assertEquals(1, resultList.size());
		// get the first vehicle
		Vehicle result = resultList.get(0);
		// check that the expected vehicle is returned
		Assert.assertEquals(vehicle.getId(), result.getId());
	}
}
