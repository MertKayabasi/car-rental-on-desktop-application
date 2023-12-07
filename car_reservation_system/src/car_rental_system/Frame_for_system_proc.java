package car_rental_system;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class Frame_for_system_proc extends JFrame implements Rent_car_receipt_operations{
	private JFrame frameprocess;
	private JLabel carinfo;
	private JLabel carinfo_loc;
	private JTextField car_type;
	private JTextField select_location;
	private JButton rent;
	private JTextField week_end;
	private  JLabel extraoption;
	private JTextField extras;
	private JLabel weekoption;
	private JTextField birakma;
	private JLabel carinfo_loc2;
	private JLabel marka_adı ;
	private JTextField marka_gir;
	Car_İnfos infoofcar=new Car_İnfos();
	public Frame_for_system_proc() {
		Location_for_rent locrent=new Location_for_rent();
		Car_İnfos system=new Car_İnfos();
		marka_adı=new JLabel("marka girin(toyota-subaru-ferrai-masserati)");
		weekoption= new JLabel("haftasonu veya haftai�i se�ene�i");
		extraoption=new JLabel("ekstra opsiyon se�in");
		extras=new JTextField(20);
		carinfo_loc=new JLabel("al�nacak lokasyonu yaz�n(etimesgut-�ankaya-k�z�lay-ke�i�ren)");
		carinfo_loc2=new JLabel("teslim edilecek lokasyonu yaz�n(etimesgut-�ankaya-k�z�lay-ke�i�ren)");
	    rent=new JButton("kirala");
		frameprocess=new JFrame();
		carinfo=new JLabel("select car type");
		car_type=new JTextField(20);
		select_location=new JTextField(20);
		week_end=new JTextField(20);
		birakma=new JTextField(20);
		marka_gir=new JTextField (20);
		
		SpringLayout layout = new SpringLayout();
		frameprocess.setLayout(layout);
		frameprocess.add(carinfo);
		frameprocess.add(car_type);
		frameprocess.add(select_location);
		frameprocess.add(carinfo_loc);
		frameprocess.add(rent);
		frameprocess.add(week_end);
		frameprocess.add(weekoption);
		frameprocess.add(extras);
		frameprocess.add(extraoption);
		frameprocess.add(birakma);
		frameprocess.add(carinfo_loc2);
		frameprocess.add(marka_adı);
		frameprocess.add(marka_gir);
		layout.putConstraint(SpringLayout.WEST, carinfo, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, carinfo, 80, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, car_type, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, car_type, 100, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, carinfo_loc, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, carinfo_loc, 120, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, select_location, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, select_location, 140, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, extraoption, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, extraoption, 160, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, extras, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, extras, 180, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, weekoption, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, weekoption,200, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, week_end, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, week_end,220, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, carinfo_loc2, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, carinfo_loc2,240, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, birakma, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, birakma,260, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, marka_adı, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, marka_adı,280, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, marka_gir, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, marka_gir,300, SpringLayout.NORTH,frameprocess);
		
		layout.putConstraint(SpringLayout.WEST, rent, 50, SpringLayout.WEST, frameprocess);
		layout.putConstraint(SpringLayout.NORTH, rent,320, SpringLayout.NORTH,frameprocess);
		
		frameprocess.setVisible(true);
		frameprocess.setSize(450, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent action){
				String car=car_type.getText();
				String extra=extras.getText();
				String loc=select_location.getText();
				String gın=week_end.getText();
				String birakılma=birakma.getText();
				String markalar=marka_gir.getText();
				Location_for_rent lok=new Location_for_rent();
				int ac=lok.number_of_car();
				int number_car=lok.number_of_car();
				Car_İnfos araba=new Car_İnfos();
				for(int i=0;i<araba.set_infos().size();i++) {
					for(int j=0;j<araba.set_extras().size();j++) {
						for(int z=0;z<araba.set_marka().size();z++) {
							for(int x=0;x<lok.set_location().size();x++) {
								for(int y=0;y<lok.set_return_location().size();y++) {
									if(araba.set_infos().get(i).equals(car)&&
											araba.set_extras().get(j).equals(extra)&&gın.equals("haftasonu")&&lok.set_location().get(x).equals(loc)&&
											lok.set_return_location().get(y).equals(birakılma)&&araba.set_marka().get(z).equals(markalar)) {
										double fatura=price_for_extras()+weekend_receipt_for_car();
										JOptionPane.showMessageDialog(null," Kiralandı="+"faturan�z="+fatura);
										break;
									
									}else if(araba.set_infos().get(i).equals(car)&&araba.set_extras().get(j).equals(extra)&&gın.equals("haftaiçi")&&lok.set_location().get(x).equals(loc)&&
											lok.set_return_location().get(y).equals(birakılma)&&araba.set_marka().get(z).equals(markalar)) {
										double fatura=price_for_extras();
										JOptionPane.showMessageDialog(null," Kiralandı="+"faturan�z="+fatura);
										break;
										
									}else if(araba.set_infos().get(i).equals(car)&&extra.equals("yok")&&gın.equals("haftaiçi")&&lok.set_location().get(x).equals(loc)&&
											lok.set_return_location().get(y).equals(birakılma)&&araba.set_marka().get(z).equals(markalar)) {
										double fatura=normal_receipt_for_car();
										JOptionPane.showMessageDialog(null," Kiralandı="+"faturanız="+fatura);
										break;
										
									}else if(araba.set_marka().get(z).equals(markalar)&&araba.set_infos().get(i).equals(car)&&extra.equals("yok")&&gın.equals("haftasonu")&&lok.set_location().get(x).equals(loc)&&
											lok.set_return_location().get(y).equals(birakılma)&&araba.set_marka().get(z).equals(markalar)) {
										double fatura=weekend_receipt_for_car();
										JOptionPane.showMessageDialog(null," Kiralandı="+"faturanız="+fatura);
										break;	
									}
								}
							}
						}
				}
			}
		}	
	
	});

}
	@Override
	public double normal_receipt_for_car() {
		double fiyat2=1500;
		String markalar=marka_gir.getText();
		if(markalar.equals("toyota")) {
			fiyat2 = fiyat2*2;
		}else if(markalar.equals("subaru")) {
			fiyat2=fiyat2*4;
		}
		else if(markalar.equals("masserati")) {
			fiyat2 = fiyat2*10;
		}
		else {
			fiyat2=fiyat2*100;
		}
		
		
		return fiyat2;
	}
	@Override
	public double weekend_receipt_for_car() {
		double fiyat=1500*2.9;
		String markalar=marka_gir.getText();
		if(markalar.equals("toyota")) {
			fiyat = fiyat*2;
		}else if(markalar.equals("subaru")) {
			fiyat=fiyat*4;
		}
		else if(markalar.equals("masserati")) {
			fiyat = fiyat*10;
		}
		else {
			fiyat=fiyat*100;
		}
		return fiyat;
	}
	@Override
	public double price_for_extras() {
		String markalar=marka_gir.getText();
		double ekstrafiyat=1500*2.3;
		if(markalar.equals("toyota")) {
			ekstrafiyat = ekstrafiyat*2;
		}else if(markalar.equals("subaru")) {
			ekstrafiyat=ekstrafiyat*4;
		}
		else if(markalar.equals("masserati")) {
			ekstrafiyat = ekstrafiyat*10;
		}
		else {
			ekstrafiyat=ekstrafiyat*100;
		}
		return ekstrafiyat;
	}
}
	
	

