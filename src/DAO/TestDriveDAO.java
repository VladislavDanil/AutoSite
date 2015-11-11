package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class TestDriveDAO extends ConnectDAO implements ITestDriveDAO {
		private static Logger log = Logger.getLogger(ZakazDAO.class);

		@Override
		public void addTestDrive(String model, String data, String name,
				String lastname, String middlename, String telefon) {
			log.info("start method");
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
				.executeUpdate("INSERT INTO mydb.test_drive (model_auto, data_test_drive,shopper_idshopper) "
						+ "Select '"+model+"','"+data+"',idshopper from shopper "
								+ "where name='"+name+"' and middle_name ='"+middlename+"' and telefon ='"+telefon+"';");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.info("" +name+"-"+ lastname +"-"+ middlename+"-"+ telefon+"");
			}
		}


		@Override
		public ArrayList<String> selectTestDrive(String id) {
			ArrayList<String> print = new ArrayList<String>();
			return print;
			
		}
	

	
}

