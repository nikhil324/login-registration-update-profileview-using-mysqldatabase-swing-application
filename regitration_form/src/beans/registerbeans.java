package beans;



public class registerbeans {
	public String username,pass,userid,mobno;

	public void setusername(String username) {
		this.username= username;
		
	}

	public void setpass(String pass) {
		this.pass=pass;
		
	}

	public void setuserid(String userid) {
		 this.userid=userid;
		
	}

	public void setmob(String mobno) {
		
		this.mobno=mobno;
	}
	public String getuserid(){
		return userid;
		
	}
    public String getuserpass(){
		return pass;
		
	}
    public String getusername(){
		return username;
	
}
    public String getmob(){
		return mobno;
	
}

}
