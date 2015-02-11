package encapsulation;

public class Addition {
	void add(int x, int y){
		System.out.println("Sum = " + (x +y));
	}
	/*I can declare this method as private if I don't want anyone outside this class to see it
	 * Private methods can not be accessed outside the class it has been declared in*/
	private void print() { 
		System.out.println("Print method");
	}
	/*when there is no accces modifiers in front of a method then that is a default 
	 * access modifier. Method with default access modifier can be accessed in the same
	 * package , not in any other package*/
    void test(){
	/*private methods can be called within this class. however, this test method can be 
	 * accessed outside this class*/
		print();
	}
	protected void protectedMethod() {
		System.out.println("Protected method ");
	}
	
}
