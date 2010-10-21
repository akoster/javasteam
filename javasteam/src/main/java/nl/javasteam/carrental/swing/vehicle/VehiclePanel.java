package nl.javasteam.carrental.swing.vehicle;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;


public class VehiclePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private VehicleSearch vehicleSearch;
	private JTable vehicleTable;
		
	public VehiclePanel() {
		setLayout(null);
		setBackground(Color.gray);
		
		VehicleTableModel tableModel = new VehicleTableModel();
		
		vehicleSearch = new VehicleSearch(tableModel);
		vehicleSearch.setBounds(5, 5, 900, 100);
		
		vehicleTable = new JTable(tableModel);
		vehicleTable.setBounds(5, 110, 900, 300);
		
		add(vehicleSearch);
		add(vehicleTable);
	}
}
