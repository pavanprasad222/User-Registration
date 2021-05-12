package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String firstName,lastName,email,phoneNumber,Password;
	    private static final Scanner SCANNER  = new Scanner(System.in);
	
	    public void checkFirstName() {
	        System.out.println("Enter First-name starts with capital letter and has minimum 3 characters : ");
	        firstName = SCANNER.nextLine();
	        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
	        if (!check) {
	            System.out.println("Sorry! Wrong Input .");
	            checkFirstName();
	        }
	        else {
	            System.out.println(" Done ! It's  Valid Firstname ");
	        }
	    }
	 
	    public void checkLastName() {
	        System.out.println("Enter Last-name starts with capital letter and has minimum 3 characters : ");
	        lastName = SCANNER.nextLine();
	        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
	        if (!check) {
	            System.out.println("Sorry! Wrong Input");
	            checkLastName();
	        }
	        else
	            System.out.println(" Done !It's  valid Lastname ");
	    }
	   
	    public void checkEmail() {
	        System.out.println("Enter a valid email(Eg. abc.psr@bl.co.in) : ");
	        email = SCANNER.nextLine();
	        check = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
	        if (!check) {
	            System.out.println("Sorry ! Wrong Input ");
	            checkEmail();
	        }
	        else {
	            System.out.println(" Email-Id is valid ");
		}
	    }

	    public void checkPhoneNumber() {
	        System.out.println("Enter Your Mobile Number (Eg. +91 9919819801) : ");
	        phoneNumber = SCANNER.nextLine();
	        check = Pattern.compile("^[\0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
	        if (!check) {
	            System.out.println(" Sorry! Wrong Input ");
	            checkPhoneNumber();
	        }
	        else {
	            System.out.println("Done ! Valid Number ");
	        }
	    }

		    
		      public void checkPassword1() {
        System.out.println("Enter Password(min 8 character): ");
        Password = SCANNER.nextLine();
        check = Pattern.compile("^[a-z]{8,}$").matcher(Password).matches();
        if (!check) {
            System.out.println(" Sorry! Wrong Input ");
            checkPassword1();
        }
        else {
            System.out.println(" Password is valid ");
        }
		      }

	    public void checkPassword2() {
	        System.out.println("Enter Password(min 8 characters, Have a Special Character): ");
	        Password = SCANNER.nextLine();
	        check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]){8,}.*$").matcher(Password).matches();
	        if (!check) {
	            System.out.println(" Sorry! Wrong Input ");
	            checkPassword2();
	        }
	        else {
	            System.out.println("Done! Password is valid ");
	        }
	    }
         public void checkPassword() {
	        System.out.println("Enter Password(min 8 characters, Have a Special Character, Have a Numerical): ");
	        Password = SCANNER.nextLine();
	        check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]){8,}.*$").matcher(Password).matches();
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
        user.checkFirstName();
        user.checkLastName();
        user.checkEmail();
        user.checkPhoneNumber();
        user.checkPassword1();
        user.checkPassword2();
        user.checkPassword();
	    }
	}

	  
