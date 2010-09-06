package nl.javasteam.carrental.swing.vehicle;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;

/**
 * 
 *
 */
public class VehicleSearchPanelDate extends JPanel {

	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("deprecation")
	public VehicleSearchPanelDate() {
		setLayout(null);
		
		JLabel fromDate = new JLabel("From");
		fromDate.setBounds(5, 5, 50, 10);
		
		JDateChooser dateChooserFromDate = new JDateChooser();
		dateChooserFromDate.setSize(100, 20);
		dateChooserFromDate.setBounds(55, 2, 100, 20);
		
		JLabel toDate = new JLabel("to");
		toDate.setBounds(160, 5, 50, 10);

		JDateChooser dateChooserToDate = new JDateChooser();
		dateChooserToDate.setSize(100, 20);
		dateChooserToDate.setBounds(175, 2, 100, 20);		
		
		add(fromDate);
		add(dateChooserFromDate);
		add(toDate);
		add(dateChooserToDate);
	}
}
