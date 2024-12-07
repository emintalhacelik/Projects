package oopIntro;
import java.util.Scanner;

public class CelikEminTalhaExercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
		System.out.println("Enter the check amount :");
		double check =scanner.nextDouble();
		
		System.out.println("Enter the tip amount percentage :");
		int tipAmount =scanner.nextInt();
		
		if(tipAmount<0 || tipAmount>100) {
			System.out.println("You entered undefined number."); 
			continue;
		} 
		
		double total;
		total = (check * tipAmount/100);
		
		char currencyUnit = '$';
		if(tipAmount < 15) {
			System.out.println("It is below the standards.");
		}
	    
		else if(tipAmount>25 ) {
			System.out.printf("Thanks for the tip, you're very generous. Your tip is :%.2f %c\n",total ,currencyUnit );
		}
			else if(tipAmount>15 && tipAmount<25 ) {
				System.out.printf("Your tip is :%.2f %c\n",total ,currencyUnit);
		}
		System.out.println();
		}
}
}
