package nl.javasteam.carrental.swing.vehicle;

import javax.swing.JTable;

/**
 * @author mlapre
 *
 */
public class VehicleTable extends JTable {

	private static final long serialVersionUID = 1L;
	
	public VehicleTable() {
		super(new VehicleTableModel());
	}
}

