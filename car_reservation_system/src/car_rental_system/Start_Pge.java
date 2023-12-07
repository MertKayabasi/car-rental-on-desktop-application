package car_rental_system;
/*MERT KAYABA�I 21995764*/
/*LOG�N SAYFASI*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Start_Pge extends JFrame{
	private JTextField password;
	private JLabel labeluser2;
	private JLabel labeluser;
	private JTextField userID;
	private JLabel extraoption;
	private JTextField extras;
	private JFrame frame;
	private JButton buttonforlogin;
	public Start_Pge() {
		password=new JTextField(20);
		labeluser=new JLabel("kullan�c� ad� (ID");
		userID=new JTextField(20);
		labeluser2=new JLabel("�ifre");
	    buttonforlogin =new JButton("login");
		frame=new JFrame();
		SpringLayout layout = new SpringLayout();
		frame.setLayout(layout);
		frame.add(userID);
		frame.add(labeluser);
		frame.add(password);
		frame.add(labeluser2);
		frame.add(buttonforlogin);
		
		layout.putConstraint(SpringLayout.WEST,labeluser ,50, SpringLayout.WEST, frame);
		layout.putConstraint(SpringLayout.NORTH, labeluser, 80, SpringLayout.NORTH, frame);
		layout.putConstraint(SpringLayout.WEST, userID, 50, SpringLayout.WEST, frame);
		layout.putConstraint(SpringLayout.NORTH, userID, 100, SpringLayout.NORTH, frame);
		layout.putConstraint(SpringLayout.WEST,labeluser2 ,50, SpringLayout.WEST, frame);
		layout.putConstraint(SpringLayout.NORTH, labeluser2, 120, SpringLayout.NORTH, frame);
		layout.putConstraint(SpringLayout.WEST, password, 50, SpringLayout.WEST, frame);
		layout.putConstraint(SpringLayout.NORTH, password, 140, SpringLayout.NORTH, frame);
		layout.putConstraint(SpringLayout.WEST, buttonforlogin, 50, SpringLayout.WEST, frame);
		layout.putConstraint(SpringLayout.NORTH, buttonforlogin, 160, SpringLayout.NORTH, frame);		
		
		frame.setVisible(true);
		frame.setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyEventHandler act1 = new MyEventHandler();
		buttonforlogin.addActionListener(act1);
			}
	public class MyEventHandler  implements ActionListener{
		User_Login idandPass=new User_Login();
		String user;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==buttonforlogin) {
				String ID=userID.getText().toString();
				String pass=password.getText().toString();
			/*	switch (ID) {
					case "mert":
						if(pass.equals(idandPass.setPass().get(0))) {
							Frame_for_system_proc mert=new Frame_for_system_proc();
							
						}else {
							JOptionPane.showMessageDialog(null,"hatal� giri� tekrar deneyin");
						}
						break;
					case "suha":
						if(pass.equals(idandPass.setPass().get(1))) {
							Frame_for_system_proc mert=new Frame_for_system_proc();
							
				
						}else {
							JOptionPane.showMessageDialog(null,"hatal� giri� tekrar deneyin");
						}
						break;
					case "sema":
						if(pass.equals(idandPass.setPass().get(2))) {
							Frame_for_system_proc mert=new Frame_for_system_proc();
							

						}else {
							JOptionPane.showMessageDialog(null,"hatal� giri� tekrar deneyin");
						}
						break;
					case "meri�":
						if(pass.equals(idandPass.setPass().get(3))) {
							Frame_for_system_proc mert=new Frame_for_system_proc();
							

						}else {
							JOptionPane.showMessageDialog(null,"hatal� giri� tekrar deneyin");
						}
						break;
					default:
						JOptionPane.showMessageDialog(null,"hatal� giri� tekrar deneyin");

							
				}*/
				
				for(int i = 0;i<idandPass.setName().size();i++) {
					System.out.println(i);
						if(idandPass.setName().get(i).equals(ID)) {
							if(idandPass.setPass().get(i).equals(pass)) {
								dispose();
								Frame_for_system_proc mert =new Frame_for_system_proc();	
								setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

								
							}else {
								JOptionPane.showMessageDialog(null,"hatal� giri� yapt�n�z tekrar deneyin");
								break;
							}
						}
				}
				
			}
		}
	}
}
			
				
				

