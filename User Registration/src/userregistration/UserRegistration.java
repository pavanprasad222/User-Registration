package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String firstName,lastName,email,phoneNumber,password;
	    private static final Scanner SCANNER  = new Scanner(System.in);


	    /**
	     * checkEmail method to match the email Id'S according to the pattern.
	     */
	    public void checkEmail() {
	        System.out.println("Enter a valid email(Eg. abc.psr@22.co.in) : ");
	        email = SCANNER.nextLine();
	        check = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
	        if (!check) {
	            System.out.println(" Invalid!!Email-ID ! please Enter a Valid input. ");
	            checkEmail();
	        }
	        else {
	            System.out.println(" Email-Id is valid ");
	        }
	    }
	
	
	 public static void main(String[]args) {
	        UserRegistration user = new UserRegistration();
	        user.checkEmail();
	 }
}