import java.util.ArrayList;



public class ArrayListApplication {
	Book b1 = new Book(1,"Java");
	Book b2 = new Book(2,"Oracle");
	Book b3 = new Book(3,".Net");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Arraylist has a ability to store any kind of values
		 * When array list has values of multiple datatype, we can have problems so we 
		 * will always do a type check
		 * Also whenever java compiles a class it automatically adds extends object in front
		 * of it, that is ArrayListApplication extends object. now generics is what was added later
		 * on in java , that means we can initial arraylist to hold specifc type of object
		 * ArrayList<Book> ob = new ArrayList<Book>();*/
		
		
	}
	public void bookStore(){
		ArrayList ob = new ArrayList();
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
		
	}

}
