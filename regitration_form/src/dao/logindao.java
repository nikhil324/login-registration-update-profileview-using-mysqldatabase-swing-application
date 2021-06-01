package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.loginbeans;
import beans.registerbeans;
import databaseconnection.Connectionprovider;

public class logindao {
	public String msg;
	public String userreg(loginbeans lbeans) {
		try {
			Connection c = Connectionprovider.getConnection();
			PreparedStatement ps= c.prepareStatement("select userid,password from registration where `userid`=? and `password`=?");
			ps.setString(1,lbeans.getuserid());
			ps.setString(2,lbeans.getpassword());
			ResultSet rs= ps.executeQuery();		
			while(rs.next()) {
				 msg="success"; 
			}
		}catch(Exception e) {
			System.out.println(e);
			
		     msg="fail";
		}
		return msg;
	}
	

}
