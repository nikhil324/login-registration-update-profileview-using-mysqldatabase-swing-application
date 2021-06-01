package regitration_form;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import listenters.loginlistener;
import listenters.profilelistener;

public class profile {
	public  JButton login2;
	public  JTextField text1;
	public  JPasswordField text2;

;
  public profile(){
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
    profilelistener login3 = new profilelistener(this);
 
    login2.addActionListener(login3);
	j1.setVisible(true);
	j1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
  }




}
