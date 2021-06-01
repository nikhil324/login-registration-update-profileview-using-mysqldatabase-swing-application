package regitration_form;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

import listenters.homelistener;

public class home  {
    public JButton login,register,update,profile;
    home()	
	{
	   JFrame j1 = new JFrame();
	   JPanel p1 = new JPanel();
	   p1.setLayout(null);
	   p1.setBounds(0, 0, 500, 350);
	   j1.add(p1);

	   j1.setLayout(null);	
	   j1.setSize(500, 600);
	   
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/burgur.jfif"));
       Image i2 = i1.getImage().getScaledInstance(530, 250, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l1 = new JLabel(i3);
       l1.setBounds(0,0, 530, 250);
       p1.add(l1);
       
       JLabel l2 = new JLabel("WELCOME TO MY T&C CAFE");
       l2.setFont(new Font("SAN_SERIF", Font.BOLD, 30 ));
       l2.setForeground(Color.red);
       l2.setBounds(25,270, 480, 50);
       p1.add(l2);
  
    
	    login = new JButton("Login");
	    update = new JButton("Update");
	    register = new JButton("Register");
	    profile = new JButton("Profile");
	   login.setBounds(200,350,100,35);
	   register.setBounds(200,400,100,35);
	   update.setBounds(200,450,100,35);
	   profile.setBounds(200,500,100,35);
	   j1.add(login);
	   j1.add(register);
	   j1.add(update);
	   j1.add(profile);
	   
	   homelistener h1 = new homelistener(this);
	   login.addActionListener(h1);
	   register.addActionListener(h1);
	   update.addActionListener(h1);
	   profile.addActionListener(h1);
	   
	   
	   j1.setVisible(true);
	   j1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	   
	}
    public static void main(String[] args) {
    	home page = new home();
    
    }

}
