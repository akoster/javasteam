package nl.javasteam.carrental.swing.vehicle;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.table.AbstractTableModel;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.Vehicle;
import nl.javasteam.carrental.swing.App;
import nl.javasteam.carrental.swing.customer.CustomerSearch;

/**
 * @author mlapre
 * 
 */
public class VehicleTableModel extends AbstractTableModel implements
		ActionListener {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle
			.getBundle("carrental");

	private enum Column {
		LICENSE() {
			Object getValue(Vehicle vehicle) {
				return vehicle.getRegistration();
			}
		},
		DESCRIPTION() {
			Object getValue(Vehicle vehicle) {
				return vehicle.getDescription();
			}
		},
		PRICE() {
			Object getValue(Vehicle vehicle) {
				return vehicle.getRentalPricePerDayEuro();
			}
		};
		abstract Object getValue(Vehicle vehicle);
	}

	private Column[] columns;
	private VehicleDao vehicleDao = (VehicleDao) App.APP_CONTEXT
			.getBean("vehicleDao");
	private List<Vehicle> vehicles;

	public VehicleTableModel() {
		super();
		columns = Column.values();
		vehicles = vehicleDao.getAll();
	}

	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public String getColumnName(int col) {
		return bundle.getString(Column.values()[col].name().toString());
	}

	public int getRowCount() {
		return vehicles.size();
	}

	public Object getValueAt(int row, int col) {
		return Column.values()[col].getValue(vehicles.get(row));
	}

	public void actionPerformed(ActionEvent event) {
		VehicleSearch vehicleSearch = (VehicleSearch) ((Component) event
				.getSource()).getParent();
		//vehicles = vehicleDao.listAvailable(vehicleSearch.getFromDate(), vehicleSearch.getTodate(), vehicleSearch.getWeight(), vehicleSearch.getDepthCentimeters(), vehicleSearch.getHeightCentimeters(), vehicleSearch.getWidthCentimeters(), vehicleSearch.getRegistration());
		super.fireTableDataChanged();		
	}

}
