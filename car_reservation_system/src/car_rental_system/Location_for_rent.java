package car_rental_system;
import java.util.Vector;

public class Location_for_rent extends Car_İnfos{
	private String local1;
	private String local2;
	private String local3;
	private String local4;
	private int num;
	Vector<String> vec_for_loc=new Vector<String>();
	Vector<String> vec_for_loc2=new Vector<String>();
	//Vector<Integer> araba_num=new Vector<Integer>();
	public Location_for_rent() {
		this.local1 = "etimesgut";
		this.local2 = "�ankaya";
		this.local3 = "ke�i�ren";
		this.local4 = "k�z�lay";
		this.num=8;
		
		this.vec_for_loc.add(local1);
		this.vec_for_loc.add(local2);
		this.vec_for_loc.add(local3);
		this.vec_for_loc.add(local4);
		
		this.vec_for_loc2.add(local1);
		this.vec_for_loc2.add(local2);
		this.vec_for_loc2.add(local3);
		this.vec_for_loc2.add(local4);
		
		/*this.vec_for_loc.add(num);
		this.vec_for_loc2.add(num);*/
		
		
		
		
		

	}
	public Vector<String> set_location() {
		return vec_for_loc;
	}
	public Vector<String> set_return_location() {
		return vec_for_loc2;
	}
	public int  number_of_car() {
		
		return num;
	}

}
