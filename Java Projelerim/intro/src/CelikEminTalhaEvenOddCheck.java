import java.util.Scanner;
public class CelikEminTalhaEvenOddCheck {

	public static void main(String[] args) {
		Scanner Keyboard= new Scanner(System.in);
        
		int number;
		
		while (true) {
		System.out.print("Enter a positive number to check if it is odd or even(If you want to stop, enter -1) :");
		
		if (Keyboard.hasNextInt()) {
         number = Keyboard.nextInt();
		
		if(number==-1) {
		System.out.println("Exiting the program.");
		break;
		} 
		
		if(number<0) {
	    System.out.println("You entered negative number. Please enter positive value.");
		continue;
		}
		
		if(number>=0 && number % 2 == 0 ) {
			System.out.println(number + " is even");
		}
		
		if (number>=0 && number % 2 != 0) {
			System.out.println(number + " is odd");
		}
		}
		else {
        System.out.println("Invalid input. Please enter a valid integer.");
        Keyboard.nextLine();
		}
		
		}	
	
	}
	
}
//I accepted 0 (zero) as a positive integer.
//If user enter -1, The program will be finish.