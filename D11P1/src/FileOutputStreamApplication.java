import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Always open the stream first and decide what constructor you want to use*/
		String fileName = "C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D11P1\\Employee.txt";
		try {
			FileOutputStream fout = new FileOutputStream(fileName);
			char c = 'j';
			/*although fout.write accepts byte that is an integer however, in this case, java
			 * auto converts j in integer */
			fout.write(c);
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

}
