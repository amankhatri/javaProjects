import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*for checked exception*/
public class Multiplication {
	public void multiply() throws IOException  {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Please enter an Integer value");
			int a = scan.nextInt();
			System.out.println("Please enter another Integer Value");
			int b = scan.nextInt();
			System.out.println("Sum = " + a*b);
			IOException ioeOB = new IOException();
			throw ioeOB;
			
		}catch(InputMismatchException ob){
			throw ob;
		}

}}

