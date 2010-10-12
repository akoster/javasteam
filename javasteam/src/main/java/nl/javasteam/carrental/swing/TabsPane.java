package nl.javasteam.carrental.swing;


import javax.swing.JTabbedPane;

import nl.javasteam.carrental.swing.contract.ContractPanel;
import nl.javasteam.carrental.swing.customer.CustomerPanel;
import nl.javasteam.carrental.swing.vehicle.VehiclePanel;

/**
 * Tabs for the user interface
 * 
 * @author mlapre
 */
public class TabsPane extends JTabbedPane {
	
	private static final long serialVersionUID = 1L;

	public TabsPane() {
		addTab("Vehicle", new VehiclePanel());
		addTab("Customer", new CustomerPanel());		
		addTab("Contract", new ContractPanel());
	}	
}
