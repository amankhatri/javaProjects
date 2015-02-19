import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadfromUserWriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D11P2";
		/*Using this stream i am using input from standard input that is a keyboard*/
		BufferedInputStream bis = new BufferedInputStream(System.in);
		
		try {
			FileOutputStream fout = new FileOutputStream(fileName);
			System.out.println("Please enter a Character");
			char c = (char) bis.read();
			fout.write(c);
	        System.out.println("Succefully written to the file");
	        bis.close();
	        fout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
