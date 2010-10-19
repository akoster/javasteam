package nl.javasteam.carrental.swing.customer;

import java.io.Console;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author mlapre
 * 
 *
 */
public class CustomerSearch extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle
	.getBundle("carrental-content");	
	private JButton jButtonCustomerSearch;
	private JTextField jTextFieldName;
	private JTextField jTextFieldId;
	
	public CustomerSearch(CustomerTableModel searchHandler) {
		
		System.out.println("start");
		setLayout(null);
		
		JLabel jLabelName = new JLabel(bundle.getString("SEARCH_LABEL_NAME"));
		jLabelName.setBounds(5, 0, 50, 30);
				
		jTextFieldName = new JTextField();
		jTextFieldName.setBounds(56, 5, 150, 20);
		
		JLabel jLabelId = new JLabel(bundle.getString("SEARCH_LABEL_ID"));
		jLabelId.setBounds(5, 26, 50, 30);

		jTextFieldId = new JTextField();
		jTextFieldId.setBounds(56, 31, 150, 20);
		
		jButtonCustomerSearch = new JButton();
		jButtonCustomerSearch.setText(bundle.getString("SEARCH_BUTTON_SEARCH"));
		jButtonCustomerSearch.addActionListener(searchHandler);
		jButtonCustomerSearch.setBounds(795, 75, 100, 20);
		
		add(jLabelName);
		add(jTextFieldName);
		add(jLabelId);
		add(jTextFieldId);
		add(jButtonCustomerSearch);

	
	}
	
	public String getCustomer(){
		return jTextFieldName.getText();
	}
	
	public Long getCustomerID() {
		try {			
			return Long.parseLong(jTextFieldId.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}
}
