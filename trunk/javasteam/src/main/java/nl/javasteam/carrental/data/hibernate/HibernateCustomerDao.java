package nl.javasteam.carrental.data.hibernate;

import java.util.List;

import nl.javasteam.carrental.data.CustomerDao;
import nl.javasteam.carrental.domain.Customer;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @author mlapre
 */
public class HibernateCustomerDao extends HibernateBaseDao<Customer, Long>
		implements CustomerDao {

	public HibernateCustomerDao() {
		super(Customer.class);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> list(Long customerID, String customerName) {
		Criteria criteria = getSession().createCriteria(Customer.class);

		// customer filter
		if (customerID != null && customerID != 0) {
			criteria.add(Restrictions.eq("id", customerID));
		}

		// customer name filter
		if (customerName != null && customerName.length() > 0) {
			String customerNameQuery = "%" + customerName.trim() + "%";
			criteria.add(Restrictions.or(
					Restrictions.like("firstName", customerNameQuery),
					Restrictions.like("lastName", customerNameQuery)));
		}

		List<Customer> customers = criteria.list();
		return customers;
	}
}
