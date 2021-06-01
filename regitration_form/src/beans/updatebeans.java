package beans;

public class updatebeans {
	public String username,pass,userid,mobno,ouserid;
	public void setuserid(String userid) {
      this.userid=userid;	
	}

	public void setpass(String pass) {
		this.pass= pass;
	}

	public void setmob(String mobno) {
	 this.mobno=mobno;
	}

	public void setusername(String username) {
		this.username=username;
	}

	public void setouserid(String ouserid) {
		this.ouserid=ouserid;
	}

	public String getouserid() {
		return ouserid;
	}

	public String getuserid() {
		return userid;
	}

	public String getuserpass() {
		return pass;
	}

	public String getmob() {
		return mobno;
	}

	public String getusername() {
		return username;
	}

}
