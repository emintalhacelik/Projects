import java.util.Scanner;

public class eminTalhaCelikAverageSnowFall {


	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	
	System.out.println("Enter the snowfall for Novomber :");
	double n =scanner.nextDouble();
	
	System.out.println("Enter the snowfall for December :");
	double d =scanner.nextDouble();
	
	System.out.println("Enter the snowfall for January :");
	double j =scanner.nextDouble();
	
	System.out.println("Enter the snowfall for February :");
	double f =scanner.nextDouble();
	
	System.out.println("Enter the snowfall for March :");
	double m =scanner.nextDouble();
	
	double average = (n+d+j+f+m)/5;
	System.out.println("Average Snowfall :" + average);
	
}
}