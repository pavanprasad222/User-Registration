package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String lastName;
	    private static final Scanner SCANNER  = new Scanner(System.in);


	    /**
	     * added check last name method according to pattern.
	     */
	    public void checkLastName() {
	        System.out.println("Enter Last-name starts with capital letter and has minimum 3 characters : ");
	        lastName = SCANNER.nextLine();
	        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
	        if (!check) {
	            System.out.println("Invalid!!Please Enter your name valic lastname.");
	            checkLastName();
	        }
	        else
	            System.out.println(" Done !It's  valid Lastname ");
	    }
	
	
	 public static void main(String[]args) {
	        UserRegistration user = new UserRegistration();
	        user.checkLastName();
	 }
}
