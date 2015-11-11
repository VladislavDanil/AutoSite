package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class ZakazDAO extends ConnectDAO implements IZakazDAO {
		private static Logger log = Logger.getLogger(ZakazDAO.class);

		@Override
		public void addZakaz(String model, String color, String dvig,
				String compl, String dopusl1, String name,
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
				.executeUpdate("INSERT INTO mydb.order (model_auto, color_auto, engine_castom_auto, "
						+ "package_castom_auto, additional_services, shopper_idshopper) "
						+ "Select '"+model+"','"+color+"','"+dvig+"','"+compl+"','"+dopusl1+"',idshopper from shopper "
								+ "where name='"+name+"' and middle_name ='"+middlename+"' and telefon ='"+telefon+"';");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.info("" +name+"-"+ lastname +"-"+ middlename+"-"+ telefon+"");
			}
		}


		@Override
		public ArrayList<String> selectZakaz(){
			ArrayList<String> print = new ArrayList<String>();
			
			try {
				ConnectDAO.conn = ConnectDAO.getConn("root", "");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ResultSet rs = null;
			try {
				rs = ConnectDAO.conn.createStatement().executeQuery(
						"Select idzakaz, name, last_name, middle_name, telefon, model_auto, color_auto, engine_castom_auto, additional_services"
						+ " from mydb.`order` inner join shopper on mydb.`order`.shopper_idshopper"
						+ "=shopper.idshopper");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			print.add("ID Имя Фамилия Отчество Телефон Модель Цвет Двигатель Комплектация");
			try {
				while (rs.next()) {
					try {
						print.add(rs.getString(0) + " " + rs.getString(1) + " "
								+ rs.getString(2) + " " + rs.getString(3) + " "
								+ rs.getString(4) + " " + rs.getString(5) + " " 
								+ rs.getString(6) + " "
								+ rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return print;
			
		}
	

	
}
