package nl.javasteam.carrental.swing.contract;

import java.awt.Color;

import javax.swing.JPanel;

/**
 * @author mlapre
 *
 */
public class ContractPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ContractSearch contractSearch;
	
	public ContractPanel() {
		
		setLayout(null);
		setBackground(Color.gray);
		
		contractSearch = new ContractSearch();
		contractSearch.setBounds(5, 5, 900, 100);
		
		add(contractSearch);
		
	}
}
