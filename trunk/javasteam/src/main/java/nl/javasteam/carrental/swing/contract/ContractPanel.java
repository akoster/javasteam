package nl.javasteam.carrental.swing.contract;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;

/**
 * @author mlapre
 *
 */
public class ContractPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ContractSearch contractSearch;
	private JTable contractTable;
	
	public ContractPanel() {
		
		setLayout(null);
		setBackground(Color.gray);
		
		ContractTableModel tableModel = new ContractTableModel();
		
		contractSearch = new ContractSearch(tableModel);
		contractSearch.setBounds(5, 5, 900, 100);
		
		contractTable = new JTable(tableModel);
		contractTable.setBounds(5, 110, 900, 100);

		add(contractSearch);
		add(contractTable);
		
	}
}
