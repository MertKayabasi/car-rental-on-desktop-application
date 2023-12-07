package car_rental_system;
/*MERT KAYABA�I 21995764*/
/*LOG�N ���N GEREKL� COMPONENTLER�N OLU�TURULMASI*/
import java.util.ArrayList;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.*;
public class User_Login {
	private ArrayList<String> members = new ArrayList<>();
	private ArrayList<String> pass = new ArrayList<>();
	private String user1;
	private String user2;
	private String user3;
	private String user4;
	private String passw1;
	private String passw2;
	private String passw3;
	private String passw4;

	public User_Login() {
		this.user1="mert";
		this.user2="suha";
		this.user3="sema";
		this.user4="meriç";
		this.members.add(user1);
		this.members.add(user2);
		this.members.add(user3);
		this.members.add(user4);
		this.passw1="mertmeric";
		this.passw2="suhasema";
		this.passw3="semasuha";
		this.passw4="meri�mert";	
		this.pass.add(passw1);
		this.pass.add(passw2);
		this.pass.add(passw3);
		this.pass.add(passw4);
	}

	public ArrayList<String> setName() {
		return members;
	}
	public ArrayList<String> setPass() {
		return pass;
	}
}