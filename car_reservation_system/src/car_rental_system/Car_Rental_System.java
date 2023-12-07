package car_rental_system;

public class Car_Rental_System {

	public static void main(String[] args) {
		Car_İnfos car=new Car_İnfos();
		File_operations files=new File_operations();
		User_Login user=new User_Login();
		First_page_OP op=new First_page_OP();
		car.set_infos();
		op.First_page_OP();
		files.file_op();
		
	   
	}

}
