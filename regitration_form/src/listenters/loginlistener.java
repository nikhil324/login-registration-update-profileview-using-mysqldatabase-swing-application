package listenters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import beans.loginbeans;
import dao.logindao;
import dao.registerdao;
import regitration_form.Registration;
import regitration_form.Login;
public class loginlistener implements ActionListener {
    Login Login; 
	public loginlistener(Login Login) {
	  this.Login =Login;
	}
	loginbeans l2 = new loginbeans();
	@Override
	public void actionPerformed(ActionEvent e) {
	    if(e.getSource()== Login.register2){
			Registration r3 = new Registration();
		}
	    else if(e.getSource()==Login.login2){
            String userid = Login.text1.getText();
			@SuppressWarnings("deprecation")
			String pass = Login.text2.getText();
        	if(userid.equals("")||pass.equals("")) {
        		JOptionPane.showMessageDialog(null,"PLEASE FILL ALL THE REQUIRED FIELDS");
        	}
        	else {
        		l2.setuserid(userid);
        		l2.setpass(pass);	
        	}
        	logindao dao2 = new logindao();
    		String msg=dao2.userreg(l2);
    		if(msg.equals("success")) {	
    			JOptionPane.showMessageDialog(null,"YOU ARE LOGGED IN SUCCESS!!!");
    		}
    		else {
    			JOptionPane.showMessageDialog(null,"PLEASE ENTER VALID USERID OR PASSWORD !!!");
    		}
		
		}	
	}

}