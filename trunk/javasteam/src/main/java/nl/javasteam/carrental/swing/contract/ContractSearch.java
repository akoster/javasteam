package nl.javasteam.carrental.swing.contract;

import java.util.Date;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

/**
 *
 *
 */
public class ContractSearch extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle
			.getBundle("carrental-content");
	private JTextField contractIdField;
	private JTextField customerField;
	private JDateChooser dateChooser;
	private JTextField vehicleField;

	public ContractSearch(ContractTableModel searchHandler) {

		setLayout(null);

		JLabel jLabelId = new JLabel(bundle.getString("SEARCH_LABEL_ID"));
		jLabelId.setBounds(5, 0, 50, 30);

		contractIdField = new JTextField();
		contractIdField.setBounds(56, 5, 150, 20);

		JLabel jLabelCustomer = new JLabel(
				bundle.getString("SEARCH_LABEL_CUSTOMER"));
		jLabelCustomer.setBounds(455, 0, 100, 30);

		customerField = new JTextField();
		customerField.setBounds(555, 5, 150, 20);

		JLabel jLabelDate = new JLabel(bundle.getString("SEARCH_LABEL_DATE"));
		jLabelDate.setBounds(5, 36, 50, 30);

		dateChooser = new JDateChooser();
		dateChooser.setSize(150, 20);
		dateChooser.setBounds(55, 36, 150, 20);

		JLabel jLabelVehicle = new JLabel(
				bundle.getString("SEARCH_LABEL_VEHICLE"));
		jLabelVehicle.setBounds(455, 36, 100, 30);

		vehicleField = new JTextField();
		vehicleField.setBounds(555, 36, 150, 20);

		JButton jButtonCustomerSearch = new JButton(bundle.getString("SEARCH_BUTTON_SEARCH"));
		jButtonCustomerSearch.addActionListener(searchHandler);
		jButtonCustomerSearch.setBounds(795, 75, 100, 20);
		
		add(jLabelId);
		add(contractIdField);
		add(jLabelCustomer);
		add(customerField);
		add(jLabelDate);
		add(dateChooser);
		add(jLabelVehicle);
		add(vehicleField);
		add(jButtonCustomerSearch);

	}

	public Long getContractId() {
		try {
			return Long.parseLong(contractIdField.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public String getCustomer() {
		return customerField.getText();
	}

	public Date getDate() {
		return dateChooser.getDate();
	}

	public String getVehicle() {
		return vehicleField.getText();
	}

}
