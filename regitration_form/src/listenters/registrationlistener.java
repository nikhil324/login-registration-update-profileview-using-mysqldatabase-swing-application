package listenters;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;

import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import beans.registerbeans;
import dao.registerdao;
import regitration_form.Registration;

public class registrationlistener implements ActionListener{
	Registration Registration;
	registerbeans r2 = new registerbeans();
	public String filename;
	
	public registrationlistener(Registration registration){
		this.Registration = registration; 
		
	}

	@Override
	 public void actionPerformed(ActionEvent e) {
        if(e.getSource()== Registration.browse) {
        //System.out.println("nikhil gupta");
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		FileNameExtensionFilter filter =new FileNameExtensionFilter("*.Images","jpg","gif","png");
		fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        
        Registration r= new Registration();
        if(result == JFileChooser.APPROVE_OPTION){
           File file = fileChooser.getSelectedFile();
            filename = file.getAbsolutePath();
            r.fiximg(filename);
//           newimg = ResizeImage(filename);

    }
        else {
        	r.fixmsg();
        }
        }
        else if(e.getSource()==Registration.register) {
        	String userid = Registration.text1.getText();
        	
			@SuppressWarnings("deprecation")
			String pass = Registration.text2.getText();
        	String username = Registration.text3.getText();
        	String mobno = Registration.text4.getText();
        	if(userid.equals("")||pass.equals("")||username.equals("")||mobno.equals("")) {
        		JOptionPane.showMessageDialog(null,"PLEASE FILL ALL THE REQUIRED FIELDS");
        	}
        	else {
        		r2.setuserid(userid);
        		r2.setpass(pass);
        		r2.setmob(mobno);
        		r2.setusername(username);
        		registerdao dao1 = new registerdao();
        		String msg=dao1.userreg(r2);
        		if(msg.equals("success")) {
        			JOptionPane.showMessageDialog(null,"YOUR REGISTRATION SUCCESS!!!");
        		}
        		else {
        			JOptionPane.showMessageDialog(null,"YOUR REGISTRATION IS INTERRUPTED!!!");
        		}
        		
        	}
        	
        }
   

	}

	



}
