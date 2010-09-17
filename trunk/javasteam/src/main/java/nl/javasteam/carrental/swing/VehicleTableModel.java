package nl.javasteam.carrental.swing;

import java.util.List;
import java.util.ResourceBundle;

import javax.swing.table.AbstractTableModel;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.Vehicle;

/**
 * @author mlapre
 * 
 */
public class VehicleTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle
			.getBundle("carrental");

	private enum Column {
		LICENSE() {
			Object getValue(Vehicle vehicle) {
				return vehicle.getCode();
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
		columns = Column.values();
		vehicles = vehicleDao.getAll();
	}

	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public String getColumnName(int col) {
		return bundle.getString(Column.values()[col].name());
	}

	public int getRowCount() {
		return vehicles.size();
	}

	public Object getValueAt(int row, int col) {
		return Column.values()[col].getValue(vehicles.get(row));
	}

}