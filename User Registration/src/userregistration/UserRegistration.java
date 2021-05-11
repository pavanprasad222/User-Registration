package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String password;
	    private static final Scanner SCANNER  = new Scanner(System.in);

	    /**
	     * Password must contain of 8 characters.
	     * Have a Special Character(eg-@$^)"
	     */
	    public void checkPassword() {
	        System.out.println("Enter Password(min 8 characters): ");
	        System.out.println("*Have a Special Character(Eg-@$^)");
	        password = SCANNER.nextLine();
	        check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]){8,}.*$").matcher(password).matches();
	        if (!check) {
	            System.out.println(" Invalid Password!! Enter a valid one. ");
	            checkPassword();
	        }
	        else {
	            System.out.println("Done! Password is valid ");
	        }
	    }
	   
	
	 public static void main(String[]args) {
	        UserRegistration user = new UserRegistration();
	        user.checkPassword();
	 }
}