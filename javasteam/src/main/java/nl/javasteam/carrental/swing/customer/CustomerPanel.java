package nl.javasteam.carrental.swing.customer;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;


/**
 * @author mlapre
 *
 */
public class CustomerPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private CustomerSearch customerSearch;
	private JTable customerTable;
	
	public CustomerPanel() {
		
		setLayout(null);
		setBackground(Color.gray);
		
		CustomerTableModel tableModel = new CustomerTableModel();
		
		customerSearch = new CustomerSearch(tableModel);
		customerSearch.setBounds(5, 5, 900, 100);
		
		customerTable = new JTable(tableModel);
		customerTable.setBounds(5, 110, 900, 100);		
		
		add(customerSearch);
		add(customerTable);
	}
}
