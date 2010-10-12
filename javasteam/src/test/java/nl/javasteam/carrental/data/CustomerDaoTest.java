package nl.javasteam.carrental.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import nl.javasteam.carrental.BaseTest;
import nl.javasteam.carrental.domain.Customer;
import nl.javasteam.carrental.domain.DriversLicense;
import nl.javasteam.carrental.domain.DriversLicenseType;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

// integration test for interaction with the database
public class CustomerDaoTest extends BaseTest {

	@Autowired
	private CustomerDao customerDao;

	@Test
	public void testCreateRead() throws InterruptedException {

		Customer customer = new Customer();
		customer.setBankAccountNumber(2376523);
		customer.setCode("12345");

		DriversLicense driversLicense = new DriversLicense();
		driversLicense.setNumber(28763827);
		driversLicense.addType(DriversLicenseType.A);
		driversLicense.addType(DriversLicenseType.B);
		driversLicense.addType(DriversLicenseType.C);
		customer.setDriversLicense(driversLicense);

		customer = customerDao.save(customer);

		assertNotNull(customer.getId());

		List<DriversLicenseType> types = customer.getDriversLicense()
				.getTypes();

		assertEquals(driversLicense.getTypes().size(), types.size());

		customer = customerDao.get(1L);
		System.out.println("Last name: " + customer.getLastName());
		types = customer.getDriversLicense().getTypes();
		System.out.println("Number of types: " + types.size());
	}
}
