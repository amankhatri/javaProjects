import java.util.ArrayList;


/*Collections are fancy arrays, the collections provide you cleaner way of providing reusable
 * data structres. The data structure you want has probably already been implemented by someone else
 * Insited the collection we have ListInterface, then we have arraylist class which implements
 * listinterface. ArrayList is an object of AbstractList, and abstractList is subclass of
 * collections.*/
/*Array is static in size, so once you declared it you can not change its size. 
 * Deleting values from array is difficult, or adding values in middle is an hassle. 
 * also the memory for array is preallocated, so it will always be inefficient while handling
 * memory*/
public class CollectionsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1, "Java");
		Book b2 = new Book(2, "Oracle");
		Book b3 = new Book(3, ".NET");
		ArrayList arrayListObj = new ArrayList();
		arrayListObj.add(b1);
		arrayListObj.add(b2);
		arrayListObj.add(b3);
		for(int i=0; i<arrayListObj.size();i++){
			Book b = (Book) arrayListObj.get(i);
			b.print();
			System.out.println("Book " + (Book)arrayListObj.get(i));
		}
		
	}

}
