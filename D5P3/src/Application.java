/*Interface is nothing but an abstract class by default
 * The difference between interface and abstract class s
 * Abstract class can have Abstract methods and Non abstract methods
 * Interfaces can have only Abstract Methods , that is all methods in interface should 
 * not have any description
 * Abstact class - one class can inherit only one abstract class
 * Interface - One class can inherit more than one interface. Any class 
 * which implements interface should override all methods of that interface*/

/*1)Use implements to inherit an interface
 * 2) in abstract class - Any class which inherits Abstract class should override all 
 * abstract methods
 * 3) Interface- Any class which inherits an interface should override all Methods of that 
 * interface because all methods inside an Interface are abstract by default , 
 * that is they can not have method body*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface MyInterface {
	void m1();
	void m2();
}

class MyInterfaceImpementation implements MyInterface {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 declared in interface overriden in implementation ");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 declared in interface overriden in implementation ");
	}
	
}