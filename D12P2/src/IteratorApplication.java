import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class IteratorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Book b1 = new Book(1,"Java");
		Book b2 = new Book(2,"Oracle");
		Book b3 = new Book(3,".Net");
		Book b4 = new Book(4,"Java Servlets");
		Book b5 = new Book(5,"Java Server Pages");
		Book b6 = new Book(6,"Java Faces");	
		
		/*we can have only have unique keys for example if we do map.put("Java", b4);, the Java
		 * Label would be overriden by b4  To resolve this we will create ArrayLlist. So we can
		 * store all the java books in arraylist and then store the entire arraylist in hash map*/
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(b1);
		bookList.add(b4);
		bookList.add(b5);
		bookList.add(b6);
		HashMap map = new HashMap();
		map.put("Oracle", b2);
		map.put("MS", b3);
		map.put("Java", bookList);
	/*We can also loop the hash map, java gives us another class called Iterator. Iterator is a
	 * interface to look through hash map
	 * Steps to iterate map objects*/
		/*1)collect all the keys from the HashMap
		 * 2)Get the iterator object for the keys
		 * 3) Loop through the iterator.*/
		Set keys = map.keySet(); /*map.keyset will give a set of keys, and set is a class*/
		Iterator itr = keys.iterator(); /*then the entire keys object will be assigned to keys*/
		while(itr.hasNext()){
			String key = (String)itr.next();
			
			Book b = (Book) map.get(key);
			b.print();
		}
		
	}

}
