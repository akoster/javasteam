package nl.javasteam.carrental.swing;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author mlapre
 *
 */
public class CustomerHeader extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public CustomerHeader() {
		
		JLabel customerHeaderTitle = new JLabel("Customer");
		JLabel customerHeaderContent = new JLabel("This pane is used for managing customers.");
		
		add(customerHeaderTitle);
		add(customerHeaderContent);
		
	}
}
