package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String password2;
	    private static final Scanner SCANNER  = new Scanner(System.in);

	  
	    public void checkPassword2() {
	        System.out.println("Enter Password(min 8 characters, Have a Special Character): ");
	        password = SCANNER.nextLine();
	        check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]){8,}.*$").matcher(password).matches();
	        if (!check) {
	            System.out.println(" Sorry! Wrong Input ");
	            checkPassword2();
	        }
	        else {
	            System.out.println("Done! Password is valid ");
	        }
	    }
	   
	
	 public static void main(String[]args) {
		 
	        UserRegistration user = new UserRegistration();
		 
	        user.checkPassword2();
	 }
}
