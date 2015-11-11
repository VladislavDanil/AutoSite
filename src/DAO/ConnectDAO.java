/* ласс реализует подключение к базе данных через соединение conection2015*/
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;

public abstract class ConnectDAO {
	private static Logger log = Logger.getLogger(ConnectDAO.class);
	public static Connection conn = null;

	public static Connection getConn(String user, String password)
			throws SQLException {
		log.info("start method");
		if (conn != null) {
			log.info("stop method");
			return conn;
		} else {
			try {
				initConn(user, password);
			} catch (ClassNotFoundException e) {
				log.error(e);
			}
			log.info("stop method");
			return conn;
		}
	}

	protected static void initConn(String user, String password)
			throws SQLException, ClassNotFoundException {
		log.info("start method");
		@SuppressWarnings("unused")
		Statement st = null;

		Class.forName("org.gjt.mm.mysql.Driver");
		Properties p = new Properties();
		p.setProperty("user", user);
		p.setProperty("password", password);
		/*
		 * две строки снизу позвол€ют задать кодировку запросов, тем самым
		 * реализуетс€ работа с русскими буквами
		 */
		p.setProperty("useUnicode", "true");
		p.setProperty("characterEncoding", "utf-8");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mydb", p);
		log.info("stop method");
	}

	public static void closeConn() throws SQLException {
		log.info("start method");
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			log.error(e);
		}
		log.info("stop method");
	}
}
