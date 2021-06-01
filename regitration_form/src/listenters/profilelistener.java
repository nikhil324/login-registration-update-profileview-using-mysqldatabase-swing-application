package listenters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import beans.profilebeans;
import dao.logindao;
import dao.profiledao;
import regitration_form.profile;
import regitration_form.showprofile;

public class profilelistener implements ActionListener {
    profile profile;
    profilebeans p1 = new profilebeans();
	public profilelistener(profile profile) {
		this.profile=profile;
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==profile.login2){
            String userid = profile.text1.getText();
			@SuppressWarnings("deprecation")
			String pass = profile.text2.getText();
        	if(userid.equals("")||pass.equals("")) {
        		JOptionPane.showMessageDialog(null,"PLEASE FILL ALL THE REQUIRED FIELDS");
        	}
        	else {
        		p1.setuserid(userid);
        		p1.setpass(pass);	
        	}
        
        	profiledao dao3 = new profiledao();
    		String msg=dao3.userprof(p1);
    		showprofile p;
    		if(msg.equals("success")) {	
    			JOptionPane.showMessageDialog(null,"YOUR PROFILE IS OPEN !!!");
    		}
    		else {
    			JOptionPane.showMessageDialog(null,"PLEASE ENTER VALID USERID OR PASSWORD !!!");
    		}
	}
}
}
