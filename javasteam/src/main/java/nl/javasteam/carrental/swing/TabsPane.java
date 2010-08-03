package nl.javasteam.carrental.swing;


import javax.swing.JTabbedPane;

/**
 * Tabs for the user interface
 * 
 * @author mlapre
 */
public class TabsPane extends JTabbedPane {
	
	private static final long serialVersionUID = 1L;

	public TabsPane() {
		addTab("Customer", new CustomerPanel());		
		addTab("Vehicle", new VehiclePanel());
		addTab("VehicleRentalContract", new VehicleRentalContractPanel());
	}	
}
