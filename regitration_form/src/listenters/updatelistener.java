package listenters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import beans.updatebeans;
import dao.registerdao;
import dao.updatedao;
import regitration_form.update;

public class updatelistener implements ActionListener {
	updatebeans u3 = new updatebeans();
	update update;
	public updatelistener(update update) {
		this.update=update;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==update.update) {
			String ouserid = update.text5.getText();
	    	String userid = update.text1.getText();
	    	
			@SuppressWarnings("deprecation")
			String pass = update.text2.getText();
	    	String username = update.text3.getText();
	    	String mobno = update.text4.getText();
	    	if(userid.equals("")||pass.equals("")||username.equals("")||mobno.equals("")) {
	    		JOptionPane.showMessageDialog(null,"PLEASE FILL ALL THE REQUIRED FIELDS");
	    	}
	    	else {
	    		u3.setouserid(ouserid);
	    		u3.setuserid(userid);
	    		u3.setpass(pass);
	    		u3.setmob(mobno);
	    		u3.setusername(username);
	    	updatedao dao2 = new updatedao();
    		String msg=dao2.userupdate(u3);
    		if(msg.equals("success")) {
    			JOptionPane.showMessageDialog(null,"YOUR UPDATION SUCCESS!!!");
    		}
    		else {
    			JOptionPane.showMessageDialog(null,"YOUR UPDATION IS INTERRUPTED!!!");
    		}
	    	}
		}
		}
}