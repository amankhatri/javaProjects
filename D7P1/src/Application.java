/*When we define a variable as static the memeory of that is not allocated inside the object, 
 * instead it remains same for all objects. The static variables are declared in common or
 * shared memory in heap, all the objects refers to same static variable. You can not use
 * a static variable in a non static way, that is you should use the name of the class 
 * to assign or to call static variable and method
 * 2)  you can only have static variables in static methods
 * 3) you can define object as static as well*/
public class Application {
	/*static block*, is the first thing which is called first even before main*/
   static {
	   System.out.println("Static Block");
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Substraction ob1 = new Substraction();
		Substraction ob2 = new Substraction();
		ob1.x = 100;
		ob1.y = 200;
		ob2.x = 10;
		ob2.y = 20;
		ob1.sub1();
		ob2.sub1();
		
		ob1.x1 = 10; // this should be Substraction.x1 = 10;
		ob1.y1 = 20;
		ob2.x1 = 20;
		ob2.y1 = 20;
		ob1.sub2();
		ob2.sub2();
		ob1.obC1.method1();
		ob1.obc2.method2();
		ob1.obc2.method1();
		

	}

}
class Substraction {
	int x;
	int y;
	static int x1;
	int y1;
	C1 obC1 = new C1();
	static C1 obc2 = new C1();
	void sub1(){
		int c = x-y;
		System.out.println("Diff - Non Static Method Non Static Variables" +c);
	}
	
	void sub2() {
		System.out.println("Static variable x " +x);
		System.out.println("Diff - Non Static Method  Static Variables x and non static variable y " + (x1-y1));
	}
	
	static void print() {
		//System.out.println("Value of x = " +x); not possible//
		System.out.println("Value of x1 = " +x1);
	}
}
class C1 {
	void method1() {
		System.out.println("Method 1 Class C1");
	}
	static void method2() {
		System.out.println("Static Method2 class C1");
	}
}
