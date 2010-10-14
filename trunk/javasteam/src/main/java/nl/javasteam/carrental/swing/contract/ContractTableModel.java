package nl.javasteam.carrental.swing.contract;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.table.AbstractTableModel;

import nl.javasteam.carrental.data.VehicleRentalContractDao;
import nl.javasteam.carrental.domain.VehicleRentalContract;
import nl.javasteam.carrental.swing.App;

public class ContractTableModel extends AbstractTableModel implements
		ActionListener {

	private static final long serialVersionUID = 1L;
	private static final ResourceBundle bundle = ResourceBundle
			.getBundle("carrental");

	private enum Column {
		CODE() {
			Object getValue(VehicleRentalContract vehicleRentalContract) {
				return vehicleRentalContract.getCode();
			}
		},
		CUSTOMER() {
			Object getValue(VehicleRentalContract vehicleRentalContract) {
				return vehicleRentalContract.getCustomer().getLastName();
			}
		},
		VEHICLE() {
			Object getValue(VehicleRentalContract vehicleRentalContract) {
				return vehicleRentalContract.getVehicle().getDescription();
			}
		},
		REGISTRATION() {
			Object getValue(VehicleRentalContract vehicleRentalContract) {
				return vehicleRentalContract.getVehicle().getRegistration();
			}
		},
		STARTDATE() {
			Object getValue(VehicleRentalContract vehicleRentalContract) {
				return vehicleRentalContract.getRentalPeriod().getStartDate();
			}
		},
		ENDDATE() {
			Object getValue(VehicleRentalContract vehicleRentalContract) {
				return vehicleRentalContract.getRentalPeriod().getEndDate();
			}
		};
		abstract Object getValue(VehicleRentalContract vehicleRentalContract);
	}

	private Column[] columns;
	private VehicleRentalContractDao vehicleRentalContractDao = (VehicleRentalContractDao) App.APP_CONTEXT
			.getBean("vehicleRentalContractDao");
	private List<VehicleRentalContract> contracts;

	public ContractTableModel() {
		super();
		columns = Column.values();
		contracts = vehicleRentalContractDao.getAll();
	}

	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public String getColumnName(int col) {
		return bundle.getString(Column.values()[col].name().toString());
	}

	public int getRowCount() {
		return contracts.size();
	}

	public Object getValueAt(int row, int col) {
		return Column.values()[col].getValue(contracts.get(row));
	}

	public void actionPerformed(ActionEvent event) {
		ContractSearch contractSearch = (ContractSearch) ((Component) event
				.getSource()).getParent();
		contracts = vehicleRentalContractDao.list(
				contractSearch.getContractId(), contractSearch.getCustomer(),
				contractSearch.getDate(), contractSearch.getVehicle());
		super.fireTableDataChanged();
	}
}
