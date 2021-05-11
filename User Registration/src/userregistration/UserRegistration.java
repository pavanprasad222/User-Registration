package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String firstName;
	    private static final Scanner SCANNER  = new Scanner(System.in);
	/**
	 *checking first name according to pattern.
	 * for this operation i have imported regex module and Scanner module.
	 */
	    public void checkFirstName() {
	        System.out.println("Enter First-name starts with capital letter and has minimum 3 characters : ");
	        firstName = SCANNER.nextLine();
	        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
	        if (!check) {
	            System.out.println("Invalid! !Please Enter your valid firstname .");
	            checkFirstName();
	        }
	        else {
	            System.out.println(" Done ! It's  Valid Firstname ");
	        }
	    }

    public static void main(String[]args) {
	            UserRegistration user = new UserRegistration();
	            user.checkFirstName();
	     
	    }
	}

	  
