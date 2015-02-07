/*Objects have their own memory, when you create a object it also creates a new memory which is just assigned to that memory
 * These objects can be used without even knowing what goes inside.
 * Encapsulation- object hide their function(methods) and data (instance variables)
 * Inheritance: Each subclass inherits all variables of its superclass
 * Polymorphism- Interface same despite different data types*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*to create a object in java , the syntax is 
         * ClassName objectName = new ClassName(); The new keyword tells java to create a new memory for the car object
         * we can create as many objects as we want. if we don't use the new keyword java can use random memory.*/
		Car mycar = new Car();
		Car mycar1 = new Car();
		Car mycar2 = new Car();
		System.out.println("Car Wheels = " +mycar.wheels);
		System.out.println("Car Windows = " +mycar.windows);
		mycar.turnLeft();
		mycar.turnRight();
		mycar.print("mycar");
		mycar.wheels = 4;
		mycar.windows = 2;
		mycar1.print("mycar" + " has " +mycar.windows +" Windows");
		mycar1.print("mycar1" + " has " +mycar1.windows +" Windows");
		mycar2.print("mycar2");
		
	}

}
