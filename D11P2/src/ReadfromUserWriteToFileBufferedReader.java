import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/*System.in is input stream and in this program we want to pass it in BufferedReader
 * which only excepts Reader objects. Because of that we use InputStreamReader*/

public class ReadfromUserWriteToFileBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D11P2\\readWriteBuffered.txt";
		InputStreamReader iosr;
		BufferedReader br;
		FileWriter fout ;
		BufferedWriter bw;
		try {
			iosr = new InputStreamReader(System.in);
			br= new BufferedReader(iosr);
			fout = new FileWriter(fileName);
			bw = new BufferedWriter(fout);
			System.out.println("Please enter a string");
			bw.write(br.readLine());
			bw.flush();
	        System.out.println("Succefully written to the file");
	        iosr.close();
	        br.close();
	        fout.close();
	        bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
