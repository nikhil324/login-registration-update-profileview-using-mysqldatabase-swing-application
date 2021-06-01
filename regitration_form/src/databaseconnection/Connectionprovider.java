package databaseconnection;

import java.sql.*;
import java.sql.DriverManager;


public class Connectionprovider {
	private Connectionprovider() {
		
	}
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(databaseinfo.DATABSE_DRIVER);
			con= DriverManager.getConnection(databaseinfo.DATABSE_URL,databaseinfo.DATABSE_USER,databaseinfo.DATABSE_PASS);
		
		}catch(Exception e) {
		    e.printStackTrace();
		}
		return con;
		
	}

}
