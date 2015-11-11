package DAO;

import java.util.ArrayList;

public interface IZakazDAO {
		public void addZakaz(String model, String color,
				String dvig, String compl, String dopusl1, String name, String lastname, String middlename,
				String telefon);

		public ArrayList<String> selectZakaz();
}