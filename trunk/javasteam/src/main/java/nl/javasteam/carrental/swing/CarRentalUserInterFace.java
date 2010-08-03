package nl.javasteam.carrental.swing;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 * CarRental User Interface
 * 
 * @author mlapre
 */
public class CarRentalUserInterFace extends JFrame {

	private static final long serialVersionUID = 1L;
	private TabsPane tabsPane;

	public CarRentalUserInterFace() {
		setTitle("CarRental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabsPane = new TabsPane();
		tabsPane.setAlignmentY(RIGHT_ALIGNMENT);
		add(tabsPane);
		pack();
		setSize(1000, 600);
		setVisible(true);
	}
}
