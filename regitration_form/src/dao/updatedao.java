package dao;
import java.sql.*;
import beans.updatebeans;
import databaseconnection.Connectionprovider;

public class updatedao {
	public String msg;
	public String userupdate(updatebeans ubeans) {
		try {
			Connection c = Connectionprovider.getConnection();
			PreparedStatement ps= c.prepareStatement("update registration set `userid`=?,`password`=?,`username`=?,`mobileno`=? where `userid`=?");
			ps.setString(5, ubeans.getouserid());
			ps.setString(1, ubeans.getuserid());
			ps.setString(2,ubeans.getuserpass());
			ps.setString(3,ubeans.getusername());
			ps.setString(4,ubeans.getmob());
			int i= ps.executeUpdate();		
			if(i>0){
				msg="success";
				}
			else{
				msg ="fail";
			}
		}catch(Exception e) {
			System.out.println(e);
			  msg="fail";
		}
		return msg;
	}
}
