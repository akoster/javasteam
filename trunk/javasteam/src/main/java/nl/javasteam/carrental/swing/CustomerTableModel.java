package nl.javasteam.carrental.swing;

import java.util.List;
import java.util.ResourceBundle;

import javax.swing.table.AbstractTableModel;

import nl.javasteam.carrental.data.CustomerDao;
import nl.javasteam.carrental.domain.Customer;

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
		return 0;
	}
	
	public int getRowCount() {
		return 0;
	}

	public Object getValueAt(int row, int col) {
		return null;
	}

}
