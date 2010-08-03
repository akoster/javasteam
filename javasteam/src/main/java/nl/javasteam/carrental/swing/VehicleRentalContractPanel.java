package nl.javasteam.carrental.swing;

import javax.swing.JPanel;

/**
 * @author mlapre
 *
 */
public class VehicleRentalContractPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private VehicleRentalContractHeader vehicleRentalContractHeader;
	
	public VehicleRentalContractPanel() {
		vehicleRentalContractHeader = new VehicleRentalContractHeader();
		add(vehicleRentalContractHeader);
	}
}
