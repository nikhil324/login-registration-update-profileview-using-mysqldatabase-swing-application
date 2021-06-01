package listenters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import regitration_form.Registration;
import regitration_form.Login;
import regitration_form.home;
import regitration_form.profile;
import regitration_form.update;

public class homelistener implements ActionListener{
	home home;
	public homelistener(home home) {
	  this.home = home;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==home.login){
		Login l1=new Login();
		}
		else if(e.getSource()==home.register) {
			Registration r1=new Registration();
		}
		else if(e.getSource()==home.update) {
			update u2=new update();
		}
		else if(e.getSource()==home.profile) {
			profile p2=new profile();
		}
	}
	

}
