package regitration_form;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

import listenters.updatelistener;

public class update {
	    public JButton update;
	    public JTextField text1,text3,text4,text5;
	    public JPasswordField text2;
  public update(){
	          
			   JFrame j1= new JFrame();
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
		       
		         text1=new JTextField();
			     text2=new JPasswordField();
			     text3=new JTextField();
			     text4=new JTextField();
			     text5=new JTextField();
			   JLabel leb5 =new JLabel("ENTER OLD USER ID :- ");
			   JLabel leb1 =new JLabel("ENTER NEW USER ID :- ");
			   JLabel leb2 =new JLabel("ENTER NEW PASSWORD :- ");
			   JLabel leb3 =new JLabel("ENTER NEW  USER NAME :- ");
			   JLabel leb4 =new JLabel("ENTER NEW  MOBILE NO. :- ");
			   update = new JButton("UPDATE");
			   update.setBounds(220,580,120,40);
			   
			   updatelistener u1 =new updatelistener(this);
			   update.addActionListener(u1);
			   
			   leb1.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
			   leb2.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
			   leb3.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
			   leb4.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
			   leb5.setFont(new Font("SAN_SERIF", Font.BOLD, 13 ));
			   text1.setFont(new Font("SAN_SERIF",Font.PLAIN,15 ));
			   text2.setFont(new Font("SAN_SERIF",Font.PLAIN, 15 ));
			   text3.setFont(new Font("SAN_SERIF",Font.PLAIN,15 ));
			   text4.setFont(new Font("SAN_SERIF",Font.PLAIN, 15 ));
			   leb5.setBounds(50,330,150,30);
			   leb1.setBounds(50,380,150,30);
			   leb2.setBounds(50,430,150,30);
			   leb3.setBounds(50,480,150,30);
			   leb4.setBounds(50,530,150,30);
			   text5.setBounds(200,330,200,30);
			   text1.setBounds(200,380,200,30);
			   text2.setBounds(200,430,200,30);
			   text3.setBounds(200,480,200,30);
			   text4.setBounds(200,530,200,30);
			   j1.add(leb1);
			   j1.add(leb2);
			   j1.add(leb3);
			   j1.add(leb4);
			   j1.add(leb5);
			   
			   j1.add(text1);
			   j1.add(text2);
			   j1.add(text3);
			   j1.add(text4);
			   j1.add(text5);
			   j1.add(update);
		      
		     
			   j1.setVisible(true);
			   j1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			}
			   }
