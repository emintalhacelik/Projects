package myLectureNotes;

public class tryings {
	public static void main(String[] args) {

	    int snowfallForNovember = 2;
	    int snowfallForDecember = 4;
	    int snowfallForJanuary = 5;
	    int snowfallForFebruary = 9;
	    int snowfallForMarch = 3;

	    int[] nums = new int[] { snowfallForNovember, snowfallForDecember, 
	                              snowfallForJanuary, snowfallForFebruary, snowfallForMarch };
	    double total = 0;

	    // Calculate total snowfall
	    for (int i = 0; i < nums.length; i++) {
	        total += nums[i];
	    }

	    // Calculate average snowfall
	    double average = total / nums.length;

	    System.out.println("Total snowfall: " + total);
	    System.out.println("Average snowfall: " + average);
  
	}
