import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/*
 * try {
 * code which can cause problem
 * }
 * catch(Exception objectofExcepetionClass) {
 * throw some error
 * }
 * when an exception or a problem occurs java will create an object of Exception class
 * Exception class will create an object, which will be caught by exception object.
 * 
 * 
 * */

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	
			try {
				System.out.println("Please enter an Integer value");
				int a = scan.nextInt();
				System.out.println("Please enter another Integer Value");
				int b = scan.nextInt();
				System.out.println("Sum = " + a+b);
				
			}catch(InputMismatchException ob){
				System.out.println("Value you entered is not valid please try again");
			}catch(NoSuchElementException ob){
				System.out.println("Error Occured");
			}
		
		
		System.out.println("End of program");
	}

}
