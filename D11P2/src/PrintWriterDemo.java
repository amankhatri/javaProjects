import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*PrintWriter supports utf8 and printstream recognises ascii*/
public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		String fileName = "C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D11P2\\printWriterfile.txt";
		try {
			@SuppressWarnings("resource")
			PrintWriter ps = new PrintWriter(fileName);
			System.out.println("Below are the two number");
			ps.print(a);
			ps.print(b);
			/*Print stream has the capability to recognize the datatype of content you are
			 * writing to the file.*/
			ps.print("Sum is: ");
			ps.print(a+b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
