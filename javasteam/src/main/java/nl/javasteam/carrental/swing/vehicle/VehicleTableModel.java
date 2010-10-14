package nl.javasteam.carrental.swing.vehicle;

import java.io.Console;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.table.AbstractTableModel;

import nl.javasteam.carrental.data.VehicleDao;
import nl.javasteam.carrental.domain.Vehicle;
import nl.javasteam.carrental.swing.App;

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

}
