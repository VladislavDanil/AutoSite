package DAO;

import java.util.ArrayList;

public interface ITestDriveDAO {
		public void addTestDrive(String model, String data, String name, String lastname, String middlename,
				String telefon);

		public ArrayList<String> selectTestDrive(String id);
}