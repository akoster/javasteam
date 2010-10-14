package nl.javasteam.carrental.swing.vehicle;


import java.util.Enumeration;
import java.util.ResourceBundle;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
/**
 * Vehicle search user interface
 *
 */
public class VehicleSearch extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle.getBundle("carrental-content");

	public class Option {
		int min;
		int max;
		String label;

		Option(int min, int max, String label) {
			this.min = min;
			this.max = max; 
			this.label = label;
		}
		
		public String toString() {
			return label;			
		}
	}
	
	public VehicleSearch() {
		setLayout(null);
		
		JLabel fromDate = new JLabel("From");
		fromDate.setBounds(5, 5, 50, 10);
		
		JDateChooser dateChooserFromDate = new JDateChooser();
		dateChooserFromDate.setSize(150, 20);
		dateChooserFromDate.setBounds(55, 2, 150, 20);
		
		JLabel toDate = new JLabel("to");
		toDate.setBounds(210, 5, 50, 10);

		JDateChooser dateChooserToDate = new JDateChooser();
		dateChooserToDate.setSize(150, 20);
		dateChooserToDate.setBounds(225, 2, 150, 20);		

		JLabel weightLabel = new JLabel(
				bundle.getString("SEARCH_LABEL_WEIGHT"));
		weightLabel.setBounds(5, 36, 50, 20);

		DefaultComboBoxModel model = new DefaultComboBoxModel();
		
		@SuppressWarnings("rawtypes")
		Enumeration keys = bundle.getKeys();
		while(keys.hasMoreElements()){
			String key = (String)keys.nextElement();
			if(key.contains("SEARCH_COMBO_WEIGHT_OPTIONS_"))
			{
				String[] values = bundle.getString(key).split(",");
				model.addElement(new Option(Integer.parseInt(values[0]), Integer.parseInt(values[1]), values[2]).toString());
			}
		}		
				
		JComboBox weightList = new JComboBox(model);
		weightList.setBounds(55, 36, 150, 20);
		
		JLabel jLabelSpace = new JLabel(bundle.getString("SEARCH_LABEL_SPACE"));
		jLabelSpace.setBounds(5, 75, 50, 20);
		
		JLabel jLabelDepth = new JLabel(bundle.getString("SEARCH_LABEL_SPACE_DEPTH"));
		jLabelDepth.setBounds(56, 75, 10, 20);
		
		JTextField textFieldDepth = new JTextField();
		textFieldDepth.setBounds(66, 75, 30, 20);
		
		JLabel jLabelHeight = new JLabel(bundle.getString("SEARCH_LABEL_SPACE_HEIGHT"));
		jLabelHeight.setBounds(106, 75, 10, 20);		
		
		JTextField textFieldHeight = new JTextField();
		textFieldHeight.setBounds(116, 75, 30, 20);

		JLabel jLabelWidth = new JLabel(bundle.getString("SEARCH_LABEL_SPACE_WIDTH"));
		jLabelWidth.setBounds(161, 75, 15, 20);		

		JTextField textFieldWidth = new JTextField();
		textFieldWidth.setBounds(176, 75, 30, 20);
		
		add(fromDate);
		add(dateChooserFromDate);
		add(toDate);
		add(dateChooserToDate);
		add(weightLabel);
		add(weightList);		
		add(jLabelSpace);			
		add(jLabelDepth);			
		add(textFieldDepth);
		add(jLabelHeight);			
		add(textFieldHeight);
		add(jLabelWidth);					
		add(textFieldWidth);		
	}
}
