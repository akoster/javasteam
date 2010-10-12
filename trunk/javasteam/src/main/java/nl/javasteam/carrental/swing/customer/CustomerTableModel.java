package nl.javasteam.carrental.swing.customer;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import nl.javasteam.carrental.data.CustomerDao;
import nl.javasteam.carrental.domain.Customer;
import nl.javasteam.carrental.swing.App;

/**
 * @author mlapre
 *
 */
public class CustomerTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private static final String[] columns = { "Code", "HomeAddress","phoneNumber"};
	
	private List<Customer> customers;
	private CustomerDao customerDao = (CustomerDao) App.APP_CONTEXT.getBean("customerDao");
	
	public CustomerTableModel() {
		customers = customerDao.getAll();
	}

	
	public int getColumnCount() {
		return columns.length;
	}
	
	public int getRowCount() {
		return customers.size();
	}

	@Override
	public String getColumnName(int col) {
		return columns[col].toString();
	}
	
	public Object getValueAt(int row, int col) {
		switch (col) {
		case 0:
			return customers.get(row).getCode();
		case 1:
			return customers.get(row).getHomeAddress();
		case 2:
			return customers.get(row).getPhoneNumber();
		default:
			break;
		}		
		return null;
	}

}
