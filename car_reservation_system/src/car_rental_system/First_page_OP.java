package car_rental_system;
/*MERT KAYABA�I 21995764*/
/*LOG�N SAYFASI ��LEMLER�*/
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class First_page_OP extends JFrame  {
	private static JButton b1;
	private JLabel lb1;
	private JTextField userID;
	private JTextField password;
	static JFrame frame=new JFrame();

	public  void First_page_OP() {
		 lb1=new JLabel("sistemi başlatmak için start butonuna basın");
		 b1=new JButton("Start");
		Container c = getContentPane();
		SpringLayout layout = new SpringLayout();
		c.setLayout(layout);
		c.add(b1);
		c.add(lb1);
		layout.putConstraint(SpringLayout.WEST, lb1, 19, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, lb1, 50, SpringLayout.NORTH, c);
		layout.putConstraint(SpringLayout.WEST, b1, 110, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, b1, 100, SpringLayout.NORTH, c);
		setTitle("Hoşgeldiniz!!");
		setSize(300,300);
	    setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyEventHandler act = new MyEventHandler();
		b1.addActionListener(act);
	}
	public class MyEventHandler  implements ActionListener{
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==b1) {
					dispose();
					Start_Pge frameop=new Start_Pge();	
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
		}
	}
}




















