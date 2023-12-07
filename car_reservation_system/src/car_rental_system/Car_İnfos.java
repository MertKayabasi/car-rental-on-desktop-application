package car_rental_system;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import java.util.Vector;
public class Car_İnfos {
	private Vector<String>  car_types = new Vector<String>();
	private Vector<String> car_extras=new Vector<String>();
	private Vector<String> marka=new Vector<String>();
	private String marka1;
	private String marka2;
	private String marka3;
	private String marka4;
	private String type1;
	private String type2;
	private String type3;
	private String type4;
	private String type5;
	private String type6;
	private String type7;
	private String type8;	
	private String extra1;
	private String extra2;
	private String extra3;
	private String extra4;
	private String extra5;
	private String extra6;
	public Car_İnfos() {
		this.type1="tek kap�";
		this.type2="d�rt kap�";
		this.type3="otomatik";
		this.type4="manuel";
		this.type5="mazot";
		this.type6="benzin";
		this.type7="smoking";
		this.type8="not smoking";
		
		this.marka1="toyota";
		this.marka2="subaru";
		this.marka3="ferrari";
		this.marka4="masserati";

		
		this.extra1="roof rack";
		this.extra2="trailer";
		this.extra3="navigation";
		this.extra4="snow chains";
		this.extra5="navigation";
		this.extra6="child seat";
		
		this.car_types.add(type1);
		this.car_types.add(type2);
		this.car_types.add(type3);
		this.car_types.add(type4);
		this.car_types.add(type5);
		this.car_types.add(type6);
		this.car_types.add(type7);
		this.car_types.add(type8);
		
		this.car_extras.add(extra1);
		this.car_extras.add(extra2);
		this.car_extras.add(extra3);
		this.car_extras.add(extra4);
		this.car_extras.add(extra5);
		this.car_extras.add(extra6);

		
		this.marka.add(marka1);
		this.marka.add(marka2);
		this.marka.add(marka3);	
		this.marka.add(marka4);
		
		
	}
	public Vector<String> set_infos() {
		
		return car_types;
	}
	public Vector<String> set_extras() {
	
		return car_extras;
	}
	public Vector<String> set_marka() {
	
		return marka;
	}


}