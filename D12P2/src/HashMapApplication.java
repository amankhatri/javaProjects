import java.util.HashMap;
/*Array list is very slow while finding stuff. 
* This is because arraylist stores the object sequentially, it always starts from zeroth element
* Now if I have to search too much, instead of arranging the books sequencially I will categorize
* them. Like one of the category will be Java, another can be .net or oracle. This will reduce
* the search operations. Instead of using ArrayList now I can use HashMap and use categorization
* Array index the objects to stores them where as hash map stores it with a key and a value. 
* Now key can be category, that is java, and value can be book name. In hash map, we will check the key
* and then give the book.
* 
* To Retrieve the value from hashmap I will use key, or key and value or value*/
public class HashMapApplication {
	Book b1 = new Book(1,"Java");
	Book b2 = new Book(2,"Oracle");
	Book b3 = new Book(3,".Net");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapApplication hashMapApplicationOB= new HashMapApplication();
		hashMapApplicationOB.bookStore();

	}
	
public void bookStore(){
	HashMap<String, Book> hashMapOB = new HashMap<String, Book>();
	hashMapOB.put("Java", b1);
	hashMapOB.put("Oracle", b2);
	hashMapOB.put(".NET", b3);
	Book b = (Book)hashMapOB.get("Java");
	b.print();
	
	
	}
	
}
