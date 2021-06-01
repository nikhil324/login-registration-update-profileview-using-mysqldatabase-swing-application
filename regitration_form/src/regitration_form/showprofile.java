package regitration_form;

import java.awt.*;

import javax.swing.*;

import dao.profiledao;

public class showprofile {
	    public  JLabel label,leb5,leb6,leb7,leb8;
	    JFrame j1;
	    String id,pass,name,mob;
		public showprofile()	
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
	           
			   JLabel leb1 =new JLabel(" USER ID :- ");
			   JLabel leb2 =new JLabel(" PASSWORD :- ");
			   JLabel leb3 =new JLabel(" USER NAME :- ");
			   JLabel leb4 =new JLabel(" MOBILE NO. :- ");
			   leb5 =new JLabel();
			   leb6 =new JLabel();
			   leb7 =new JLabel();
			   leb8 =new JLabel();
		    
			   
			   leb1.setFont(new Font("SAN_SERIF", Font.BOLD, 15 ));
			   leb2.setFont(new Font("SAN_SERIF", Font.BOLD, 15 ));
			   leb3.setFont(new Font("SAN_SERIF", Font.BOLD, 15 ));
			   leb4.setFont(new Font("SAN_SERIF", Font.BOLD, 15 ));
			   leb5.setFont(new Font("SAN_SERIF", Font.BOLD, 19 ));
			   leb5.setForeground(Color.blue);
			   leb6.setFont(new Font("SAN_SERIF", Font.BOLD, 19 ));
			   leb6.setForeground(Color.blue);
			   leb7.setFont(new Font("SAN_SERIF", Font.BOLD, 19 ));
			   leb7.setForeground(Color.blue);
			   leb8.setFont(new Font("SAN_SERIF", Font.BOLD, 19 ));
			   leb8.setForeground(Color.blue);
	
			   leb1.setBounds(50,330,150,30);
			   leb2.setBounds(50,380,150,30);
			   leb3.setBounds(50,430,150,30);
			   leb4.setBounds(50,480,150,30);
			   leb5.setBounds(200,330,150,40);
			   leb6.setBounds(200,380,150,40);
			   leb7.setBounds(200,430,150,40);
			   leb8.setBounds(200,480,150,40);

		
			   j1.add(leb1);
			   j1.add(leb2);
			   j1.add(leb3);
			   j1.add(leb4);
			   j1.add(leb5);
			   j1.add(leb6);
			   j1.add(leb7);
			   j1.add(leb8);
			  

			   j1.setVisible(true);
			   j1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			}
	   	     

}
