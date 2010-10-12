package nl.javasteam.carrental.data.hibernate;

import java.util.Date;
import java.util.List;

import nl.javasteam.carrental.data.CustomerDao;
import nl.javasteam.carrental.domain.Customer;

/**
 * 
 * @author mlapre
 */
public class HibernateCustomerDao extends HibernateBaseDao<Customer, Long> 
	implements CustomerDao {

	public HibernateCustomerDao() {
		super(Customer.class);
	}

	public List<Customer> listCustomer(String code, String firstName,
			String lastName, String homeAddress, int phoneNumber,
			int bankAccountNumber, Date birthDate, Object driversLicense) {
			
		return null;
	}

}
