import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*bufferedwriter or bufferedread uses filewriter or filereader to improve the performance,*/

public class BufferedWriterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D11P1\\Employee.txt";
		FileWriter fw;
		try {
			/*this constructor of FileWriter accepts filename and the append mode*/
			fw = new FileWriter(fileName,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Buffered writer ");
			bw.write("\n");
			bw.write('c');
			 /*remember you always have to flush the data to the text file after writing it
			  * this would print the file.Since bufferedwriter buffers the data , the 
			  * data needs to be flushed*/
			bw.flush();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
