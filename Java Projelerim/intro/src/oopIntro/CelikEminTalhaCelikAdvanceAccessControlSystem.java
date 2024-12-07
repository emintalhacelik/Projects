package oopIntro;
import java.util.Scanner;
public class CelikEminTalhaCelikAdvanceAccessControlSystem {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int time;
		String employeesSecurity ;
		
		System.out.print("Please enter your employee role: (ADMIN, USER OR GUEST): ");
		employeesSecurity = keyboard.nextLine();
		
		
		System.out.print("Please enter what time it is: ");
		time = keyboard.nextInt();
		
		if(employeesSecurity.equals("ADMIN")) {
			System.out.println("Access Granted");
		}
		
		if(employeesSecurity.equals("USER")){
		if(time>=9 && time<=17) {
			 System.out.println("Access Granted");
		 }
		else {
			System.out.println("Access Denied");
		}
		}
	}

}
