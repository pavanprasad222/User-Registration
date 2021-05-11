package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String phoneNumber;
	    private static final Scanner SCANNER  = new Scanner(System.in);


	    /**
	     * check mobile number
	     */
	    public void checkPhoneNumber() {
	        System.out.println("Enter Your phoneNumber (Eg. +91 9919819801) : ");
	        phoneNumber = SCANNER.nextLine();
	        check = Pattern.compile("^[\0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
	        if (!check) {
	            System.out.println(" Number is invalid! !Please Enter a Valid Number. ");
	            checkPhoneNumber();
	        }
	        else {
	            System.out.println("Done ! Valid Number ");
	        }
	    }
	
	 public static void main(String[]args) {
	        UserRegistration user = new UserRegistration();
	        user.checkPhoneNumber();
	 }
}
