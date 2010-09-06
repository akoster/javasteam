package nl.javasteam.carrental.swing.vehicle;


import java.awt.Color;

import javax.swing.JPanel;
/**
 * Vehicle search user interface
 *
 */
public class VehicleSearch extends JPanel {

	private static final long serialVersionUID = 1L;
	private VehicleSearchPanelDate vehicleSearchPanelDate;
	private VehicleSearchPanelWeight vehicleSearchPanelWeight;
	
	public VehicleSearch() {
		setLayout(null);
		setBackground(Color.lightGray);
		
		vehicleSearchPanelDate = new VehicleSearchPanelDate();
		vehicleSearchPanelDate.setBounds(5, 5, 300, 25);
		
		vehicleSearchPanelWeight = new VehicleSearchPanelWeight();
		vehicleSearchPanelWeight.setBounds(5, 26, 300, 40);
		
		add(vehicleSearchPanelDate);
		add(vehicleSearchPanelWeight);
	}
}
