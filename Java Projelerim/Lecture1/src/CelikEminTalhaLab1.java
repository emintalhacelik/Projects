import java.util.Scanner;

public class CelikEminTalhaLab1{
	
	public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);	
	
	System.out.println("Please Enter first number");
	int value1= Keyboard.nextInt();
	System.out.println("Please enter second number");
	int value2= Keyboard.nextInt();
	System.out.println("Please Enter third number");
	int value3= Keyboard.nextInt();
	
	int totalValue = displayTotal(value1,value2,value3);
	
	System.out.println("Total is: "+ totalValue);
	}
	public static int displayTotal(int x,int y,int z) {
		int total = x + y + z ;
		return total;
	}
	
}
