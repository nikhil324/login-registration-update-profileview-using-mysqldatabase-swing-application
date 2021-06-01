package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.loginbeans;
import beans.profilebeans;
import databaseconnection.Connectionprovider;
import regitration_form.showprofile;

public class profiledao {
	public String msg,printid,printpass,printname,printmob;
	showprofile s = new showprofile();
	public String userprof(profilebeans pbeans) {
			try {
				Connection c = Connectionprovider.getConnection();
				PreparedStatement ps= c.prepareStatement("select * from registration where `userid`=? and `password`=?");
				ps.setString(1,pbeans.getuserid());
				ps.setString(2,pbeans.getpassword());
				ResultSet rs= ps.executeQuery();		
				while(rs.next()) {
					 msg="success";
					 s.leb5.setText(rs.getString("userid"));
					 s.leb6.setText(rs.getString("password"));
					 s.leb7.setText(rs.getString("username"));
					 s.leb8.setText(rs.getString("mobileno"));
				}
			}catch(Exception e) {
				//System.out.println("nikhil");
				System.out.println(e);
			     msg="fail";
			}
			return msg;
		}
	
}