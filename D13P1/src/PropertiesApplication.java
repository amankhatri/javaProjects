import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*Properties is a kind of hash map which can be used to read key value pair from a text file*/
public class PropertiesApplication {
	private static String FILE_NAME = "C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D13P1\\FileName.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*never hardcode suff, so if you have to store new values in a program, you should not
			 * have to change the entire code. ALl the codes which needs to be changed should be kept
			 * outside a java file. For example if there is a database and some one decides to change 
			 * the name of the file, then we would have to come in here and change the file name, which
			 * is not fare, so we should avoid doing the code changes as much as possible. So we keep
			 * the stuff which can change outside the program, like this file name
			FileInputStream fis = new FileInputStream("C:\\Users\\Aman\\Documents\\GitHub\\javaProjects\\D13P1\\Capitals.txt");
			and for this name we will create a text file and put the path as key value pair, 
			and we will keep this file as a constant and feed it to fis*/
			FileInputStream fn = new FileInputStream(FILE_NAME);
			Properties fnProperty = new Properties();
			fnProperty.load(fn);
			String fileName = fnProperty.getProperty("ReadFile");
			
			FileInputStream fis = new FileInputStream(fileName);
			Properties prop = new Properties();
			/*we are loading key value files*/
			prop.load(fis);
			/*Reading a value from a map*/
				/*	1) Get the key set*/
			Set keySet = prop.keySet();
				/*2) Get the iterator object*/
			Iterator itr = keySet.iterator();
				/* 3) Loop through iterator*/
			while(itr.hasNext()){
				String key = (String)itr.next();
				String value = prop.getProperty(key);
				System.out.println("Key " +key + " Value " +value);
			}
			
		}catch(FileNotFoundException fne){
			System.out.println(fne);
		}catch(IOException ioe){
			System.out.println(ioe);
		}

	}

}
