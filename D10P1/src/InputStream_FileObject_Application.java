import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*IO- Input Output. if we want to read or write to a drive, 
 * 1) we establish the connection, which creates a pipeline between the source and destination
 * 2) input means I want to read something from file, output means I want to write something
 * to file
 * 3) There are two seperate stream established between source and destination
 * from source(computer) to destination(file) is an output stream
 * and destination to source is input stream
 * Streams.
 * 1) All modern I/O is stream based
 * 2) A stream is a connection to a source of data or to a destination for data (sometimes both)
 * 3)An input stream may be associated with the keyboard.
 * 4) An input stream or an output stream may be associated with a file
 * 5) Different streams have different characterstics
 * 		a) A file has a definite length and therefore an end
 * 		b) Keyboard input has no specific end
 * Java has specific classes from input devices and output devices. You can write code in
 * java to communicate with any device, like with scanners or even automobiles or anything
 * 
 * How to do I/o
 * 1) Open the stream. Call a number
 * 2) Use the stream to read write or both. talk to the guy
 * 3) close the stream.  Disconnect the call.
 * The IO classes are prebuilt in java.IO package
 * 
 * Some class can end with inputstream i.e someNameInputStream 
 * used for reading files
 * Also There are some classes which end with Reader, that is someNameReaders, to
 * read files I can used BufferedReader, or any other kind of reader
 *
 * Some classes can end with outputStream i.e someNameOutputStream used for writing to files
 * Also There are some classes which end with Writer, that is someNameWriter, to
 * write files I can used BufferedWriter, or any other kind of Writer
 * 
 * Java gives us to options to write or to right and the reason is: 
 * Any class ending with inputstream or outputstream supports ASCII. 
 * Any class ending with Reader or Writer supports UTF-8.
 * UTF8 supports all the languages in the world where as ASCII does not.
 * If I am reading an imageFile or audio or other fancy file
 * then i have to use inputstream or output stream. 
 * where as Languages are understood by utf8
 * 
 * */

/*Goal of project -- to know how to communicate with file*/
public class InputStream_FileObject_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Using file class we can only perform file operations after this we can
		 * use input/output stream or readers or writers to read or write the file.*/
		File f = new File("C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D10P1\\test.txt");
		File fDir = new File("C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D10P1");
		/*object f refers to test.txt file*/
		try {
			f.createNewFile();
			System.out.println("File Created");
			boolean isReadable = f.canRead();
			System.out.println("Does File have Read Permission " + isReadable);
			boolean isWritable = f.canWrite();
			System.out.println("Does File have Write Permission " +isWritable);
			//f.delete();  used for deleting file.
			System.out.println("Does File exist? " +f.exists()); //to check the presence of file
			boolean isDirectory = f.isDirectory();
			System.out.println("Is Directory? "+isDirectory);
			/*to get the list of the files in directory we can use f.listFile() which
			 * returns an array of file objects, that is it creates an object for each file
			 * in the directory and give you an array of file objects*/
			File fileArray[] = fDir.listFiles();
			for(int i = 0; i<fileArray.length; i++){
				System.out.println("File Names in the directory " +fileArray[i].getName());
			}
			
			/*creating new dir*/
			File createFDir = new File("C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D10P1\\createdSubFolder");
			createFDir.mkdir();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*2) Now we will read the file using InputStream or Reader class
	 * a) Using inputStream*/
		
		try {
			/*2 a 1) We will now open the stream*/
			FileInputStream fis = new FileInputStream("C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D10P1\\test.txt");
			 /*2 a 2) we will now read file, remember fis object refers to test.txt.
			  * The read method reads a single character from the file, character a time, 
			  * that is it reads a byte of data, in form of integer. That is it returns int
			  * That is it returns the asci equivalent of char, so we have to cast ascii to char. */
				//System.out.println((char)fis.read());
			/*so if I do while(fis.read()!=-1) {Sysout((char fis.read())} will not work
			 * because I am calling fis.read() twice so it skips a character.*/
			int r;
			while((r=fis.read())!=-1){
				System.out.print((char)r);
			}
				
				/*2 a 3) now we close the fis stream */
				fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exisist");
		}catch (IOException e){
			System.out.println("Filed Communication, when somebody deletes the file");
		}
		
		
	}

}
