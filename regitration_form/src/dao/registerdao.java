package dao;
import java.sql.*;


import beans.registerbeans;
import databaseconnection.Connectionprovider;

public class registerdao {
	public String msg;
	public String userreg(registerbeans rbeans) {
		try {
			Connection c = Connectionprovider.getConnection();
			PreparedStatement ps= c.prepareStatement("insert into registration values(?,?,?,?)");
			ps.setString(1, rbeans.getuserid());
			ps.setString(2,rbeans.getuserpass());
			ps.setString(3,rbeans.getusername());
			ps.setString(4,rbeans.getmob());
			int i = ps.executeUpdate();
			if(i>0){
				msg="success";
				}
			else{
				msg ="fail";
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return msg;
	}
	
}
