package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String firstName,lastName,email,phoneNumber,password;
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

	    /**
	     * checkEmail method to match the email Id'S according to the pattern.
	     */
	    public void checkEmail() {
	        System.out.println("Enter a valid email(Eg. abc.psr@bl.co.in) : ");
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

	    /**
	     * This checkPhonenumber method will check the user mobile number according to the pattern.
	     */
	    public void checkPhoneNumber() {
	        System.out.println("Enter Your Mobile Number (Eg. +91 9919819801) : ");
	        phoneNumber = SCANNER.nextLine();
	        check = Pattern.compile("^[\0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
	        if (!check) {
	            System.out.println(" Number is invalid! !Please Enter a Valid Number. ");
	            checkPhoneNumber();
	        }
	        else {
	            System.out.println("Done ! Valid Number ");
	        }
		    public static void main(String[]args) {
        UserRegistration user = new UserRegistration();
        user.checkFirstName();
        user.checkLastName();
        user.checkEmail();
        user.checkPhoneNumber();
	    }
	}

	  
