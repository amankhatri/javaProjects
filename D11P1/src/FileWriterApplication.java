import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D11P1\\Employee.txt";
		try {
			FileWriter fwrt = new FileWriter(fileName);
			char c = 'j';
			/*although fout.write accepts byte that is an integer however, in this case, java
			 * auto converts j in integer */
			fwrt.write(c);
			fwrt.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

}
