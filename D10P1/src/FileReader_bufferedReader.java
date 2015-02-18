import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

/*We are using filereader, because we can use it for reading files in any language, since 
 * it reads utf 8. FileReaders are slow  so we use buffered reader class*/
public class FileReader_bufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*BUffered Reader need file reader*/
			FileReader fr = new FileReader("C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D10P1\\test.txt");
			/*file reader is based on to buffered reader char by char but it will buffer the
			 * contents equivalent to a line. so it increases the efficiency*/
			/*1) We will now open the stream*/
			BufferedReader br = new BufferedReader(fr);
			/*Read from the stream*/
			String str;
			while((str=br.readLine())!=null){
				System.out.print(str);
			}
			/*Close the stream*/
				br.close();
				fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exisist");
		}catch (IOException e){
			System.out.println("Filed Communication, when somebody deletes the file");
		}
	}

}
