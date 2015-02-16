import java.util.InputMismatchException;
import java.util.Scanner;
/*thowing an exception means you are not doing anything with the exception and 
 * giving a chance to author of the program to manage it. It goes to the author. the
 * keyword throw tells that this part of code will throw the error to the caller of 
 * this code. The key word Throws is to alert the caller that this method will
 * or can throw the specified kind of error whereas, the Key word "throw" literally
 * gives or throws the error to the caller of the code or method. Throws is used
 * 2) There are two types of exceptions, a) checked and b) unchecked. Any exception class that
 * is a subclass of runtime exception class at anylevel, even if it is a grand child, 
 * we call it as an unchecked exception. That is even if I don't catch exceptions, java
 * would not force the programmer to handle the exception. 
 * Any sub class of Exceptionclass other than RunTimeException is a checked exception
 * a) checked Exceptions are the exceptions which are direct subclass of exception class.
 *  remember throws key word is nessasry to thow an exception object*/

public class Addition {
	public void add() throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Please enter an Integer value");
			int a = scan.nextInt();
			System.out.println("Please enter another Integer Value");
			int b = scan.nextInt();
			System.out.println("Sum = " + a+b);
			
		}catch(InputMismatchException ob){
			/*this is an unchecked exception because in main function even if we dont
			 * surround the method call for add method in main function there would not
			 * be any compiler error */
			throw ob;
		}finally {
			System.out.println("Execute this code always in finally block");
		}


	}
}
