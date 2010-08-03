package nl.javasteam.carrental.swing;

import javax.swing.JPanel;

/**
 * @author mlapre
 *
 */
public class CustomerPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private CustomerHeader customerHeader;
	private CustomerTable customerTable;

	public CustomerPanel() {
		customerHeader = new CustomerHeader();
		customerTable = new CustomerTable();
		add(customerHeader);
		add(customerTable);
	}
}
