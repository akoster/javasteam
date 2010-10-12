package nl.javasteam.carrental.swing.vehicle;

import java.awt.Color;

import javax.swing.JPanel;


public class VehiclePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private VehicleSearch vehicleSearch;
	private VehicleTable vehicleTable;
		
	public VehiclePanel() {
		setLayout(null);
		setBackground(Color.gray);
		
		vehicleSearch = new VehicleSearch();
		vehicleSearch.setBounds(5, 5, 900, 100);
		
		vehicleTable = new VehicleTable();
		vehicleTable.setBounds(5, 110, 900, 300);
		
		add(vehicleSearch);
		add(vehicleTable);
	}
}
