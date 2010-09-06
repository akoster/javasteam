package nl.javasteam.carrental.swing.vehicle;

import java.util.ResourceBundle;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * Vehicle search weight panel UI
 *
 */
public class VehicleSearchPanelWeight extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle.getBundle("vehiclesearch");
	
	public VehicleSearchPanelWeight() {
		setLayout(null);
		
		JLabel weightLabel = new JLabel(bundle.getString("VEHICLESEARCH_LABEL_WEIGHT"));
		weightLabel.setBounds(5, 5, 50, 20);
		
		String[] weightListOptions = bundle.getString("VEHICLESEARCH_COMBO_WEIGHT_OPTIONS").split(",");
		
		JComboBox weightList = new JComboBox(weightListOptions);
		weightList.setBounds(55, 5, 100, 20);
		
		add(weightLabel);
		add(weightList);
	}
}
