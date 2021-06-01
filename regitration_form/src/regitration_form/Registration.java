package regitration_form;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.swing.*;
import listenters.homelistener;
import listenters.registrationlistener;

public class Registration {
	public JButton browse;
	public Image newimg;
    //public JPanel p1;
    public JLabel label;
    public JButton register;
    public JTextField text1,text3,text4;
    public JPasswordField text2;
    JFrame j1;
    registrationlistener r1;
    
	public  Registration()	
		{
		    j1= new JFrame();
		   j1.setLayout(null);
		   j1.setLocation(550,100);
		   j1.setSize(500, 700);
		   
	       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/burgur.jfif"));
           Image i2 = i1.getImage().getScaledInstance(530, 250, Image.SCALE_DEFAULT);
	       ImageIcon i3 = new ImageIcon(i2);
	       JLabel l1 = new JLabel(i3);
	       l1.setBounds(0,0, 530, 250);
	       j1.add(l1);
	       
	       
	       JLabel l2 = new JLabel("WELCOME TO MY T&C CAFE");
	       l2.setFont(new Font("SAN_SERIF", Font.BOLD, 30 ));
           l2.setForeground(Color.red);
           l2.setBounds(25,270, 480, 50);
           j1.add(l2);
	       
	       browse =new JButton("Browse");
	       browse.setBounds(100,560,100,35);
	       j1.add(browse);
	       r1=new registrationlistener(this);
	       
	         text1=new JTextField();
		     text2=new JPasswordField();
		     text3=new JTextField();
		     text4=new JTextField();
		   JLabel leb1 =new JLabel("ENTER USER ID :- ");
		   JLabel leb2 =new JLabel("ENTER PASSWORD :- ");
		   JLabel leb3 =new JLabel("ENTER USER NAME :- ");
		   JLabel leb4 =new JLabel("ENTER MOBILE NO. :- ");
		   JLabel leb5 =new JLabel("** ADD YOUR PROFILE PHOTO....... ");
		   register = new JButton("REGISTER");
		   register.setBounds(360,560,100,30);
		   
		   register.addActionListener(r1);
		   
		   leb1.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
		   leb2.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
		   leb3.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
		   leb4.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
		   text1.setFont(new Font("SAN_SERIF",Font.PLAIN,15 ));
		   text2.setFont(new Font("SAN_SERIF",Font.PLAIN, 15 ));
		   text3.setFont(new Font("SAN_SERIF",Font.PLAIN,15 ));
		   text4.setFont(new Font("SAN_SERIF",Font.PLAIN, 15 ));
		   leb1.setBounds(50,330,150,30);
		   leb2.setBounds(50,380,150,30);
		   leb3.setBounds(50,430,150,30);
		   leb4.setBounds(50,480,150,30);
		   text1.setBounds(200,330,200,30);
		   text2.setBounds(200,380,200,30);
		   text3.setBounds(200,430,200,30);
		   text4.setBounds(200,480,200,30);
		   leb5.setFont(new Font("SAN_SERIF", Font.BOLD, 11 ));
		   leb5.setForeground(Color.red);
		   leb5.setBounds(30,520,180,20);
		   j1.add(leb1);
		   j1.add(leb2);
		   j1.add(leb3);
		   j1.add(leb4);
		   j1.add(leb5);
		   j1.add(text1);
		   j1.add(text2);
		   j1.add(text3);
		   j1.add(text4);
		   j1.add(register);
	      
	       browse.addActionListener(r1);
		   j1.setVisible(true);
		   j1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		}
   	     public void fiximg(String filename) {
           ImageIcon i4 = new ImageIcon(filename);
   	       Image i5 = i4.getImage();
   	       Image newimg=i5.getScaledInstance(530, 250, Image.SCALE_DEFAULT);
    	   ImageIcon i6 = new ImageIcon(newimg);
	       label =new JLabel(i6);
           label.setBounds(230,520, 100, 130);
           System.out.println("nikhilkiuytredffh");
           j1.add(label);
		   
	   }
		public void fixmsg() {
			label =new JLabel("**PLEASE SET VALID IMAGE FORMAT LIKE(.img,.png,.gif)");
		       label.setFont(new Font("SAN_SERIF", Font.BOLD, 8 ));
	           label.setForeground(Color.red);
	           label.setBounds(230,520, 100, 130);
	           j1.add(label);
			
		}
	
		   

}
