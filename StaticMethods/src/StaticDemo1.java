
public class StaticDemo1 {
	void f1() {
		/*this is instance method*/
		System.out.println("I am from F1 instance method \n");
	}
	void f2() {
		/*this is instance method*/
		System.out.println("I am from F2 instance method \n");
	}
	static void f3() {
		/*you cannot call instance methods in static methods 
		 * that is you can't do f1() inside this function*/
		System.out.println("I am from F3 instance method and is"
				+ "specific to this class, so you have to do "
				+ "classname.f3() to call me \n");
	}
	public  StaticDemo1() {
		System.out.println("I am from constructor \n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo1.f3();
		StaticDemo1 sd1 = new StaticDemo1();
		sd1.f1();
		/*you cannot call instance methods in static methods*/
		
	}
	static {
		/*first static blocks in the program are executed even before
		 * main method*/
		System.out.println("I am from static block 1 \n");
	}
	static{
		System.out.println("I am from static block 2 \n");
		/*you can access methods from other classes in static blocks
		 * by creating the objects :D*/
		/*static blocks are executed when the class StaticDemo1 is created*/
	}
	{/*first static, second normal block*/
		System.out.println("Normal Block \n");
	}
	

}
