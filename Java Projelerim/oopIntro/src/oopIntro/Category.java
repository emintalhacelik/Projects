package oopIntro;

public class Category {
   public static void main(String[] args){
	   double day,month,year,price,profitPercantage,percantage;
	   day=19;
	   month=10;
	   year=2024;
	   price=1000;
	   profitPercantage= 15 ;
	   percantage=100;
	   double addition = price *profitPercantage/percantage ; 
	   double realPrice = price + addition;
	  
	   double theOtherWay= price  %profitPercantage;
	   double theOtherWayEm= theOtherWay + price;
	   
	  
	   System.out.println("Today is :" + day + '\t' + month + "th month" + '\t'+ year );
	
	   System.out.println("Profit Percantage with %15 profit is : " + realPrice );
	   
	   System.out.println("The other way price is : " +theOtherWayEm );
	   
   }
   
   
}
