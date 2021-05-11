package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String password;
	    private static final Scanner SCANNER  = new Scanner(System.in);
		
		/**
     * Password must be of 8 characters.
     */
    public void checkPassword() {
        System.out.println("Enter Password(min 8 character): ");
        password = SCANNER.nextLine();
        check = Pattern.compile("^[a-z]{8,}$").matcher(password).matches();
        if (!check) {
            System.out.println(" Invalid Password!! Enter a valid one. ");
            checkPassword();
        }
        else {
            System.out.println(" Password is valid ");
        }
    }
	   
	
	 public static void main(String[]args) {
	        UserRegistration user = new UserRegistration();
	        user.checkPassword();
	 }
}
