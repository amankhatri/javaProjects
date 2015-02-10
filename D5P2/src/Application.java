/*Abstract method is a method which deosn't have any functionality , the subclasses
	 * of abstract class. An Abstract method is always inside a abstract Class.
	 * abstract class cannot be instantiated, 
	 * that is you can not do 
	 * abstactClass absc = new abstractClass()
	 * however you can create an object of abstract class
	 * for example abstractClass absc; you always have to initialize to null
	 * 
	 *  Anyabstract methods must and should be overriden by subclasses
*/

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A ab = new B(); //Can access elements of ab which are common to bothth B and A 
		ab.a1();
		ab.a2Overriden();
		/*when you invoke the object of sub class, the constructor of super class is
		 * created first*/
		A ac = new C();
		ac.a1();
		ac.a2Overriden(); //now since c is extention of B so a2Overriden() is used
		/*when you invoke the object of sub class, the constructor of super class is
		 * created first. */
		B b = new B();
		/*I can't do this B ba = new A()*/
		C c = new C();
		
		
	}

}
/*the sub classes should have the similar kind of constructor as super class
 * you can call the non default constructor of super class from sub class by 
 * using super() in the sub class constructor */
class A {
	A() {
		System.out.println("Constructor A");
	}
	A(int x) {
		System.out.println("Not a default Constructor");
	}
	void a1() {
		System.out.println("Class A, method A1");
	}
	void a2Overriden() {
		System.out.println("a2Overriden Class A");
	}
}
class B extends A {
	B() {
		super(10); 
		System.out.println("Constructor B");
	}
	B(int x) {
		System.out.println("Overloaded constructor of Class B");
	}
	
	void a2Overriden() {
		System.out.println("a2Overriden Class B");
	}
	void b1() {
		System.out.println("Class B, method B1");
		super.a1();// you can call the method of super class without creating an object of super 
	//class
		/*Super key word is used to call an members of super class from the sub class
		 * */
	}
	 // you can call the method of super class
}
class C extends B {
	C() {
		super(2);
		System.out.println("Constructor C");
	}
	void c1() {
		System.out.println("Class C, method C1");
	}
}




