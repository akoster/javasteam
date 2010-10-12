package nl.javasteam.carrental.swing.customer;

import javax.swing.JTable;

/**
 * @author mlapre
 *
 */
public class CustomerTable extends JTable {

	private static final long serialVersionUID = 1L;
	
	public CustomerTable() {
		super(new CustomerTableModel());
	}
}
