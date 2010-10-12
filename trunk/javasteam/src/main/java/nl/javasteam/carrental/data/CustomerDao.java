package nl.javasteam.carrental.data;

import java.util.Date;
import java.util.List;

import nl.javasteam.carrental.domain.Customer;

/**
 * 
 * @author mlapre
 */
public interface CustomerDao extends BaseDao<Customer, Long> {

	// Provided by BaseDao:
	// --Enter new customer
	// --Find customer by id
	// --Update customer
	// --List all customers

	List<Customer> listCustomer(String code, String firstName, String lastName,
			String homeAddress, int phoneNumber, int bankAccountNumber, Date birthDate,
			Object driversLicense);
	
}
