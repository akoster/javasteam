package nl.javasteam.carrental.swing;

import javax.swing.JPanel;

public class VehiclePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private VehicleHeader vehicleHeader;
	private VehicleTable vehicleTable;
		
	public VehiclePanel() {
		vehicleHeader = new VehicleHeader();
		vehicleTable = new VehicleTable();
		add(vehicleHeader);
		add(vehicleTable);
	}
}
