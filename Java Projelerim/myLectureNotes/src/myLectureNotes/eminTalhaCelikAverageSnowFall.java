package myLectureNotes;

public class eminTalhaCelikAverageSnowFall {

	public static void main(String[] args) {
	
		int snowfallForNovember = 2;
	    int snowfallForDecember = 4;
	    int snowfallForJanuary = 5;
	    int snowfallForFebruary = 9;
	    int snowfallForMarch = 3;

	    int[] nums = new int[] { snowfallForNovember, snowfallForDecember, 
	                              snowfallForJanuary, snowfallForFebruary, snowfallForMarch };
	    double total = 0;

	    
	    for (int i = 0; i < nums.length; i++) {
	        total += nums[i];
	    }

	    
	    double average = total / nums.length;

	    System.out.println("Snowfall for November: " + snowfallForNovember);
	    System.out.println("Snowfall for December: " + snowfallForDecember);
	    System.out.println("Snowfall for January: "+ snowfallForJanuary);
	    System.out.println("snowfall for February: " + snowfallForFebruary);
	    System.out.println("snowfall for March: " + snowfallForMarch);
	    System.out.println("Average snowfall for 5 months:  " + average);
    }
}