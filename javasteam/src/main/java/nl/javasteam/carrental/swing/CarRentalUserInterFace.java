package nl.javasteam.carrental.swing;

import javax.swing.JFrame;

import nl.javasteam.carrental.swing.menu.MenuBar;

/**
 * CarRental User Interface
 * 
 * @author mlapre
 */
public class CarRentalUserInterFace extends JFrame {

	private static final long serialVersionUID = 1L;
	private TabsPane tabsPane;
	private MenuBar menuBar;

	public CarRentalUserInterFace() {
		
		setTitle("CarRental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// You could use a Layoutmanager, for example:
		// setLayout(new BorderLayout());
		setLayout(null);

		menuBar = new MenuBar();
		menuBar.setBounds(0, 0, 1000, 20);
		// add(menuBar, BorderLayout.NORTH);
		add(menuBar);

		tabsPane = new TabsPane();
		tabsPane.setBounds(0, 25, 1000, 575);
		add(tabsPane);

		pack();
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}
