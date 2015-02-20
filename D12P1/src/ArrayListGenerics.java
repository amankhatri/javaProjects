import java.util.ArrayList;

public class ArrayListGenerics {
	Book b1 = new Book(1,"Java");
	Book b2 = new Book(2,"Oracle");
	Book b3 = new Book(3,".Net");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 /* on in java , that means we can initial arraylist to hold specifc type of object
	 * ArrayList<Book> ob = new ArrayList<Book>();*/
	
public void bookStore(){
	ArrayList<Book> ob = new ArrayList<Book>();
	ob.add(b1);
	ob.add(b2);
	ob.add(b3);
	for(int i=0;i<ob.size();i++){
		/*array list gives me a generic objects*/
		Object obj = ob.get(i);
		/*now we will check if object is an instance of book then only we will bring book
		 * else we will print the object. Always remember to do type check*/
		if(obj instanceof Book){
			Book b = (Book) obj;
			b.print();
		}
		else{
			System.out.println(obj);
		}
	}
	
}}
