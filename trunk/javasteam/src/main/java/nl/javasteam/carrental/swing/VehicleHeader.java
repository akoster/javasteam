package nl.javasteam.carrental.swing;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author mlapre
 *
 */
public class VehicleHeader extends JPanel {

	private static final long serialVersionUID = 1L;

	public VehicleHeader() {

		JLabel vehicleHeaderTitle = new JLabel("Vehicle");
		vehicleHeaderTitle.setHorizontalTextPosition(JLabel.LEFT);
		add(vehicleHeaderTitle);
		
		JLabel vehicleHeaderContent = new JLabel("This pane is used for managing the carrental vehicles.");
		vehicleHeaderContent.setHorizontalAlignment(JLabel.LEFT);
		add(vehicleHeaderContent);		
	}
}
