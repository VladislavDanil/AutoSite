package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class MaintenanceDAO extends ConnectDAO implements IMaintenanceDAO {

	@Override
	public void addMaintenance(String model, String data, String namber_maintenance_auto, String name,
			String lastname, String middlename, String telefon) {
		try {
			ConnectDAO.conn = ConnectDAO.getConn("root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.createStatement()
			.executeUpdate("INSERT INTO mydb.shopper (name, last_name, middle_name, telefon)"
					+ " VALUES ('"+name+"', '"+lastname+"', '"+middlename+"', '"+telefon+"')");
			conn.createStatement()
			.executeUpdate("INSERT INTO mydb.maintenance_auto (model_auto, namber_maintenance_auto, "
					+ "data_maintenance_auto, shopper_idshopper) "
					+ "Select '"+model+"','"+namber_maintenance_auto+"','"+data+"',idshopper from shopper "
							+ "where name='"+name+"' and middle_name ='"+middlename+"' and telefon ='"+telefon+"';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<String> selectMaintenace(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
