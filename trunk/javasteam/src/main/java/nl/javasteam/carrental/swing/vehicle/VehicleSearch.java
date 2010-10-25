package nl.javasteam.carrental.swing.vehicle;

import java.util.Date;
import java.util.Enumeration;
import java.util.ResourceBundle;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JDateChooser;

/**
 * Vehicle search user interface
 * 
 */
public class VehicleSearch extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle
			.getBundle("carrental-content");
	private JDateChooser dateChooserFromDate;
	private JDateChooser dateChooserToDate;
	private DefaultComboBoxModel model;
	private JComboBox weightList;
	private JTextField textFieldDepth;
	private JTextField textFieldHeight;
	private JTextField textFieldWidth;
	private JTextField textFieldRegistration;
	private JSpinner jSpinnerPriceBounds;
	private SpinnerModel PriceBoundmodel;
	private JSlider jSliderMinPrice;
	private JSlider jSliderMaxPrice;
	private JLabel jLabelMinPrice;
	private JLabel jLabelMaxPrice;
	private JLabel jLabelMinPriceSelected;
	private JLabel jLabelMaxPriceSelected;
	private Integer minPrice = new Integer(0);
	private Integer maxPrice = new Integer(100);
	private Integer maxPriceIncreased = new Integer(0);
	private Integer maxPriceBoundUp = new Integer(0);
	private Integer step = new Integer(1);

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

	public VehicleSearch(VehicleTableModel searchHandler) {
		setLayout(null);

		JLabel fromDate = new JLabel("From");
		fromDate.setBounds(5, 5, 50, 10);

		dateChooserFromDate = new JDateChooser();
		dateChooserFromDate.setSize(150, 20);
		dateChooserFromDate.setBounds(55, 2, 150, 20);

		JLabel toDate = new JLabel("to");
		toDate.setBounds(210, 5, 50, 10);

		dateChooserToDate = new JDateChooser();
		dateChooserToDate.setSize(150, 20);
		dateChooserToDate.setBounds(225, 2, 150, 20);

		JLabel weightLabel = new JLabel(bundle.getString("SEARCH_LABEL_WEIGHT"));
		weightLabel.setBounds(5, 36, 50, 20);

		DefaultComboBoxModel model = new DefaultComboBoxModel();

		@SuppressWarnings("rawtypes")
		Enumeration keys = bundle.getKeys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			if (key.contains("SEARCH_COMBO_WEIGHT_OPTIONS_")) {
				String[] values = bundle.getString(key).split(",");
				model.addElement(new Option(Integer.parseInt(values[0]),
						Integer.parseInt(values[1]), values[2]).toString());
			}
		}

		weightList = new JComboBox(model);
		weightList.setBounds(55, 36, 150, 20);

		JLabel jLabelSpace = new JLabel(bundle.getString("SEARCH_LABEL_SPACE"));
		jLabelSpace.setBounds(5, 75, 50, 20);

		JLabel jLabelDepth = new JLabel(
				bundle.getString("SEARCH_LABEL_SPACE_DEPTH"));
		jLabelDepth.setBounds(56, 75, 10, 20);

		textFieldDepth = new JTextField();
		textFieldDepth.setBounds(66, 75, 30, 20);

		JLabel jLabelHeight = new JLabel(
				bundle.getString("SEARCH_LABEL_SPACE_HEIGHT"));
		jLabelHeight.setBounds(106, 75, 10, 20);

		textFieldHeight = new JTextField();
		textFieldHeight.setBounds(116, 75, 30, 20);

		JLabel jLabelWidth = new JLabel(
				bundle.getString("SEARCH_LABEL_SPACE_WIDTH"));
		jLabelWidth.setBounds(161, 75, 15, 20);

		textFieldWidth = new JTextField();
		textFieldWidth.setBounds(176, 75, 30, 20);

		JLabel jLabelRegistration = new JLabel(
				bundle.getString("SEARCH_LABEL_REGISTRATION"));
		jLabelRegistration.setBounds(461, 2, 70, 20);

		textFieldRegistration = new JTextField();
		textFieldRegistration.setBounds(536, 2, 150, 20);

		try {
			maxPrice = Integer.parseInt(bundle
					.getString("SEARCH_TEXT_DEFAULT_VALUE"));
			maxPriceBoundUp = maxPrice + 100;
		} catch (NumberFormatException e) {
			maxPrice = 100;
		}

		PriceBoundmodel = new SpinnerNumberModel(maxPrice, minPrice,
				maxPriceBoundUp, step);
		jSpinnerPriceBounds = new JSpinner(PriceBoundmodel);
		jSpinnerPriceBounds.setBounds(693, 36, 50, 20);
		jSpinnerPriceBounds.addChangeListener(new PriceBoundsActionChanged());

		jSliderMinPrice = new JSlider(0, 100, 0);
		jSliderMinPrice.setBounds(461, 36, 115, 20);
		jSliderMinPrice.addChangeListener(new MinAmountChangeAction());

		jLabelMinPrice = new JLabel(bundle.getString("SEARCH_LABEL_MIN_PRICE"));
		jLabelMinPrice.setBounds(461, 57, 70, 20);

		jLabelMinPriceSelected = new JLabel();
		jLabelMinPriceSelected.setBounds(524, 57, 70, 20);

		jSliderMaxPrice = new JSlider(0, 100, 0);
		jSliderMaxPrice.setBounds(578, 36, 115, 20);
		jSliderMaxPrice.addChangeListener(new MaxAmountChangeAction());

		jLabelMaxPrice = new JLabel(bundle.getString("SEARCH_LABEL_MAX_PRICE"));
		jLabelMaxPrice.setBounds(578, 57, 70, 20);

		jLabelMaxPriceSelected = new JLabel();
		jLabelMaxPriceSelected.setBounds(643, 57, 70, 20);

		JButton jButtonVehicleSearch = new JButton(
				bundle.getString("SEARCH_BUTTON_SEARCH"));
		jButtonVehicleSearch.addActionListener(searchHandler);
		jButtonVehicleSearch.setBounds(795, 75, 100, 20);

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
		add(jLabelRegistration);
		add(textFieldRegistration);
		add(jSpinnerPriceBounds);
		add(jSliderMinPrice);
		add(jLabelMinPrice);
		add(jLabelMinPriceSelected);
		add(jSliderMaxPrice);
		add(jLabelMaxPrice);
		add(jLabelMaxPriceSelected);
		add(jButtonVehicleSearch);
	}

	public class PriceBoundsActionChanged implements ChangeListener {

		public void stateChanged(ChangeEvent e) {
			jSliderMinPrice
					.setMaximum((Integer) jSpinnerPriceBounds.getValue());
			jSliderMaxPrice
					.setMaximum((Integer) jSpinnerPriceBounds.getValue());

			maxPriceIncreased = (Integer) jSpinnerPriceBounds.getValue();
			maxPrice = (Integer) jSpinnerPriceBounds.getValue() + 100;
			maxPriceIncreased = (Integer) jSpinnerPriceBounds.getValue();
			PriceBoundmodel = new SpinnerNumberModel(maxPriceIncreased,
					minPrice, maxPrice, step);
			jSpinnerPriceBounds.setModel(PriceBoundmodel);
		}
	}

	public class MinAmountChangeAction implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			jLabelMinPriceSelected.setText(Integer.toString(jSliderMinPrice
					.getValue()));
			if (jSliderMinPrice.getValue() > jSliderMaxPrice.getValue()) {
				jLabelMaxPriceSelected.setText(Integer.toString(jSliderMinPrice
						.getValue()));
				jSliderMaxPrice.setValue(jSliderMinPrice.getValue());
			}
		}
	}

	public class MaxAmountChangeAction implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			jLabelMaxPriceSelected.setText(Integer.toString(jSliderMaxPrice
					.getValue()));
			if (jSliderMaxPrice.getValue() < jSliderMinPrice.getValue()) {
				jLabelMinPriceSelected.setText(Integer.toString(jSliderMaxPrice
						.getValue()));
				jSliderMinPrice.setValue(jSliderMaxPrice.getValue());
			}
		}
	}

	public Date getFromDate() {
		return dateChooserFromDate.getDate();
	}

	public Date getTodate() {
		return dateChooserToDate.getDate();
	}

	public Integer[] getWeight() {

		Integer minWeight = 0;
		Integer maxWeight = 0;
		Integer[] result = new Integer[2];

		try {

			@SuppressWarnings("rawtypes")
			Enumeration keys = bundle.getKeys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				if (key.contains("SEARCH_COMBO_WEIGHT_OPTIONS_")) {
					String[] values = bundle.getString(key).split(",");
					if (values[2].toString().equals(
							weightList.getSelectedItem().toString())) {
						minWeight = Integer.parseInt(values[0]);
						maxWeight = Integer.parseInt(values[1]);
						result[0] = minWeight;
						result[1] = maxWeight;
					}
				}
			}
		} catch (Exception e) {
			System.out
					.println("No SEARCH_COMBO_WEIGHT_OPTIONS_ that matches with the chosen weight option!");
			result = null;
		}

		return result;
	}

	public Integer getDepthCentimeters() {
		try {
			return Integer.parseInt(textFieldDepth.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public Integer getHeightCentimeters() {
		try {
			return Integer.parseInt(textFieldHeight.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public Integer getWidthCentimeters() {
		try {
			return Integer.parseInt(textFieldWidth.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public Integer getMinPrice() {
		return jSliderMinPrice.getValue();
	}

	public Integer getMaxPrice() {
		return jSliderMaxPrice.getValue();
	}

	public String getRegistration() {
		return textFieldRegistration.getText();
	}

	public Integer getMinWeight() {		
		return jSliderMinPrice.getValue();
	}

	public Integer getMaxWeight() {		
		return jSliderMaxPrice.getValue();
	}
}
