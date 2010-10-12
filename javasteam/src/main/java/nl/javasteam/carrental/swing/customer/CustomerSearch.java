package nl.javasteam.carrental.swing.customer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import nl.javasteam.carrental.data.CustomerDao;
import nl.javasteam.carrental.domain.Customer;
import nl.javasteam.carrental.swing.App;

/**
 * @author mlapre
 * 
 *
 */
public class CustomerSearch extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle
	.getBundle("carrental-content");
	
	JButton jButtonCustomerSearch = new JButton();
	JTextField jTextFieldName = new JTextField();
	JTextField jTextFieldId = new JTextField();
	
	public CustomerSearch() {
		
		setLayout(null);
		
		JLabel jLabelName = new JLabel(bundle.getString("SEARCH_LABEL_NAME"));
		jLabelName.setBounds(5, 0, 50, 30);
		
		jTextFieldName.setBounds(56, 5, 150, 20);
		
		JLabel jLabelId = new JLabel(bundle.getString("SEARCH_LABEL_ID"));
		jLabelId.setBounds(5, 26, 50, 30);

		jTextFieldId.setBounds(56, 31, 150, 20);
		
		jButtonCustomerSearch.setText(bundle.getString("SEARCH_BUTTON_SEARCH"));
		jButtonCustomerSearch.setBounds(795, 75, 100, 20);
		
		add(jLabelName);
		add(jTextFieldName);
		add(jLabelId);
		add(jTextFieldId);
		add(jButtonCustomerSearch);
	}
}
