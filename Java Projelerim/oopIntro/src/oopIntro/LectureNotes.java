package oopIntro;
import java.util.Scanner;

public class LectureNotes {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 // Input for security level, role, and time of day
        System.out.print("Enter the security level (1-5): ");
        int securityLevel = scanner.nextInt();
        scanner.nextLine();  // Consume newline left by nextInt()
        
        System.out.print("Enter the role (ADMIN, USER, GUEST): ");
        String role = scanner.nextLine().toUpperCase();
        
        System.out.print("Enter the time of day (0-23): ");
        int timeOfDay = scanner.nextInt();

        // Access control logic
        if (securityLevel < 1 || securityLevel > 5 || (!role.equals("ADMIN") && !role.equals("USER") && !role.equals("GUEST"))) {
            // Invalid input handling
            System.out.println("Access Denied");
        } else if (securityLevel == 5) {
            // Anyone with security level 5 can access the facility at any time
            System.out.println("Access Granted");
        } else if (role.equals("ADMIN") && securityLevel >= 4) {
            // Admins with security level 4 or higher can access the facility at any time
            System.out.println("Access Granted");
        } else if (role.equals("USER") && securityLevel >= 3 && timeOfDay >= 9 && timeOfDay <= 17) {
            // Users with security level 3 or higher can access the facility between 9 AM and 5 PM
            System.out.println("Access Granted");
        } else if (role.equals("GUEST") && securityLevel >= 2 && timeOfDay >= 10 && timeOfDay <= 16) {
            // Guests with security level 2 or higher can access the facility between 10 AM and 4 PM
            System.out.println("Access Granted");
        } else {
            // If none of the conditions are met, deny access
            System.out.println("Access Denied");
        }
          if (securityLevel<1 || securityLevel>5) {
        	System.out.println("You entered wrong number");  
        	  
          }
        scanner.close();
	}

}
