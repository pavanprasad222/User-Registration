package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String password;
	    private static final Scanner SCANNER  = new Scanner(System.in);

	   
	    public void checkPassword() {
	        System.out.println("Enter Password(min 8 characters): ");
	        System.out.println("*Have a Special Character(Eg-@$^)");
	        System.out.println("*Have a Number(0-9)");
	        password = SCANNER.nextLine();
	        check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]){8,}.*$").matcher(password).matches();
	        if (!check) {
	            System.out.println(" Sorry! Wrong Input ");
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
