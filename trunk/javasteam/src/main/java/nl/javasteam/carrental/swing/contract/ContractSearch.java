package nl.javasteam.carrental.swing.contract;

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
	
	public ContractSearch() {
		
		setLayout(null);
		
		JLabel jLabelId = new JLabel(bundle.getString("SEARCH_LABEL_ID"));
		jLabelId.setBounds(5, 0, 50, 30);

		JTextField jTextFieldId = new JTextField();
		jTextFieldId.setBounds(56, 5, 150, 20);
		
		JLabel jLabelCustomer = new JLabel(bundle.getString("SEARCH_LABEL_CUSTOMER"));
		jLabelCustomer.setBounds(455, 0, 100, 30);

		JTextField jTextFieldCustomer = new JTextField();
		jTextFieldCustomer.setBounds(555, 5, 150, 20);
		
		JLabel jLabelDate = new JLabel(bundle.getString("SEARCH_LABEL_DATE"));
		jLabelDate.setBounds(5, 36, 50, 30);

		JDateChooser dateChooserDate = new JDateChooser();
		dateChooserDate.setSize(150, 20);
		dateChooserDate.setBounds(55, 36, 150, 20);		
		
		JLabel jLabelVehicle = new JLabel(bundle.getString("SEARCH_LABEL_VEHICLE"));
		jLabelVehicle.setBounds(455, 36, 100, 30);

		JTextField jTextFieldVehicle = new JTextField();
		jTextFieldVehicle.setBounds(555, 36, 150, 20);
		
		JButton jButtonCustomerSearch = new JButton(bundle.getString("SEARCH_BUTTON_SEARCH"));
		jButtonCustomerSearch.setBounds(795, 75, 100, 20);
		
		add(jLabelId);
		add(jTextFieldId);
		add(jLabelCustomer);
		add(jTextFieldCustomer);
		add(jLabelDate);
		add(dateChooserDate);
		add(jLabelVehicle);
		add(jTextFieldVehicle);
		add(jButtonCustomerSearch);
		
	}
}
