package regitration_form;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.AncestorListener;

import listenters.loginlistener;
public class Login {
	public  JButton register2;
	public  JButton login2;
	public  JTextField text1;
	public  JPasswordField text2;

;
  public Login(){
	JFrame j1 = new JFrame();
	   JPanel p1 = new JPanel();
	   p1.setLayout(null);
	   p1.setBounds(0, 0, 400, 200);
	   j1.add(p1);
	   j1.setLocation(550, 150);

	   j1.setLayout(null);	
	   j1.setSize(400, 500);
	   
	    text1=new JTextField();
	    text2=new JPasswordField();
	   JLabel leb1 =new JLabel("ENTER USER ID :- ");
	   JLabel leb2 =new JLabel("ENTER PASSWORD :- ");
	   login2 = new JButton("Login");
	   register2 = new JButton("Register");
	   register2.setBounds(70,350,100,30);
	   login2.setBounds(250,350,100,30);
	   leb1.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
	   leb2.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
	   text1.setFont(new Font("SAN_SERIF",Font.PLAIN,15 ));
	   text2.setFont(new Font("SAN_SERIF",Font.PLAIN, 15 ));
	   leb1.setBounds(30,230,150,30);
	   leb2.setBounds(30,290,150,30);
	   text1.setBounds(190,230,180,30);
	   text2.setBounds(190,290,180,30);
	   j1.add(leb1);
	   j1.add(leb2);
	   j1.add(text1);
	   j1.add(text2);
	   j1.add(login2);
	   j1.add(register2);
	   
	   
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/burgur.jfif"));
    Image i2 = i1.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l1 = new JLabel(i3);
    l1.setBounds(0,0, 400, 150);
    p1.add(l1);
    
    JLabel l2 = new JLabel("WELCOME TO MY T&C CAFE");
    l2.setFont(new Font("SAN_SERIF", Font.BOLD, 25 ));
    l2.setForeground(Color.red);
    l2.setBounds(20,170, 380, 35);
    p1.add(l2);
    loginlistener login1 = new loginlistener(this);
    register2.addActionListener(login1);
    login2.addActionListener(login1);
	j1.setVisible(true);
	j1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
  }



}
