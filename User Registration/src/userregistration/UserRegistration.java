package userregistration;

	import java.util.Scanner;
	import java.util.regex.*;
	
	public class UserRegistration {
	    private boolean check;
	    private String Email;
	    private static final Scanner SCANNER  = new Scanner(System.in);


    public void checkEmail() {
        System.out.println("Enter a valid email(Eg. abc.psr@22.co.in) : ");
        email = SCANNER.nextLine();
        check = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
        if (!check) {
            System.out.println(" Sorry! Wrong Input ");
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
