package nl.javasteam.carrental.swing.customer;

import java.awt.Color;

import javax.swing.JPanel;


/**
 * @author mlapre
 *
 */
public class CustomerPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private CustomerTable customerTable;
	private CustomerSearch customerSearch;

	public CustomerPanel() {
		
		setLayout(null);
		setBackground(Color.gray);
		
		customerSearch = new CustomerSearch();
		customerSearch.setBounds(5, 5, 900, 100);
		
		customerTable = new CustomerTable();
		customerTable.setBounds(5, 110, 900, 300);
		
		add(customerSearch);
		add(customerTable);
	}
}
