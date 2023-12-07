package car_rental_system;
/*MERT KAYABA�I 21995764*/
/*B�LG�LER�N DOSYAYA YAZILMASI ��LEV�*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class File_operations {
	private User_Login users=new User_Login();
	private Car_İnfos  cars=new Car_İnfos();
	private Location_for_rent locate=new Location_for_rent();
	public void file_op() {
		String dosyaYolu = "C://OOP-�dev2//test.txt";
		try
		{
		FileOutputStream fos = new FileOutputStream(dosyaYolu);
		 
		for(int i=0;i<users.setName().size();i++) {
			fos.write("---------------------------------------------------------------------------\r\n".getBytes());
			fos.write(users.setName().get(i).getBytes());
			fos.write("\r\n".getBytes());
			fos.write("\r\n".getBytes());
		}
		for(int i=0;i<cars.set_infos().size();i++) {
			fos.write("---------------------------------------------------------------------------\r\n".getBytes());
			fos.write(cars.set_infos().get(i).getBytes());
			fos.write("\r\n".getBytes());
			fos.write("\r\n".getBytes());
		}
		for(int i=0;i<cars.set_extras().size();i++) {
			fos.write("---------------------------------------------------------------------------\r\n".getBytes());
			fos.write(cars.set_extras().get(i).getBytes());
			fos.write("\r\n".getBytes());
			fos.write("\r\n".getBytes());
		}
		for(int i=0;i<locate.set_location().size();i++) {
			fos.write("---------------------------------------------------------------------------\r\n".getBytes());
			fos.write(locate.set_location().get(i).getBytes());
			fos.write("\r\n".getBytes());
			fos.write("\r\n".getBytes());
		}
		
	
		 
		fos.close();
		 
		}
		catch(FileNotFoundException ex)
		{
		System.out.println("Dosya Bulunamad� Hatas� : " + ex);
		}
		catch(IOException ioe)
		{
		System.out.println("Giri� Hatas� : " + ioe);
		}
		 
		 
		}
		 
	

}
