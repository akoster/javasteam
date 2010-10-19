package nl.javasteam.carrental.data;

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

	List<Customer> list(Long customerID, String customerName);
	
}
