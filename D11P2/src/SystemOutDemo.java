import java.io.PrintStream;
/*System is an inbuilt class in java 
 * out is an inbuilt class which represents output device monitor
 * println this is a method*/

public class SystemOutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 10;
			int b = 20;
			/*System.out is an object of outputstream which represents console*/
			@SuppressWarnings("resource")
			PrintStream ps = new PrintStream(System.out);
			System.out.println("Below are the two number");
			ps.print(a);
			ps.print(b);
			/*Print stream has the capability to recognize the datatype of content you are
			 * writing to the file.*/
			ps.print("Sum is: ");
			ps.print(a+b);
		
	}

}
