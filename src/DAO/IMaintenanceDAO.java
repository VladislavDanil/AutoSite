package DAO;

import java.util.ArrayList;

public interface IMaintenanceDAO {
	public void addMaintenance(String model, String namber_maintenance_auto, String data, String name, 
			String lastname, String middlename,String telefon);
	public ArrayList<String> selectMaintenace(String id);
}
