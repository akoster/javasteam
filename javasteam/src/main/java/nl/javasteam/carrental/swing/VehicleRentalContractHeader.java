package nl.javasteam.carrental.swing;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author mlapre
 *
 */
public class VehicleRentalContractHeader extends JPanel {

	private static final long serialVersionUID = 1L;	
	
	public VehicleRentalContractHeader() {

		JLabel vehicleRentalContractHeaderTitle = new JLabel("Vehicle Rental Contracts");
		JLabel vehicleRentalContractHeaderContent = new JLabel("This pane is used for managing the carrental vehicle contracts.");
		
		add(vehicleRentalContractHeaderTitle);
		add(vehicleRentalContractHeaderContent);
	}
}
