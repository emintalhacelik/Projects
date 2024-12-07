package oopIntro;

import java.util.Scanner;

public class Chapter2ex9 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		String firstName = keyboard.next();
        System.out.println( "your first name :" + firstName );
        

		System.out.println("Please enter your first integer value");
		int value1 = keyboard.nextInt();
		System.out.println("Please enter your second integer value ");
		int value2 = keyboard.nextInt();
		System.out.println("The total is :" + (value1 + value2));
	}

}
