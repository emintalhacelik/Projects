import java.util.Scanner;
public class exercise2 {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
	
     for (;;) {
     int chessePizzaPrice = 6;
    
     
     System.out.println("Enter how many toppings you want: ");
     int numberOfToppings = scanner.nextInt();
     
     double toppingsCost ;
     
     
     if (numberOfToppings>=2) {
    	toppingsCost = 1.5;
     }else {
    	 toppingsCost=2;
     }
     
     double totalToppingsCost = numberOfToppings * toppingsCost;
     
     double totalCost = totalToppingsCost + chessePizzaPrice;
     if(totalCost>10) {
    	 totalCost = totalCost * 0.95;
     }
     
     System.out.printf("Total cost is : %.2f $\n", totalCost);
   
     }
	}
}
