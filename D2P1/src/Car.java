/*Members of the class: members of the class includes instance variables and methods. The local function variables like
 * int speed are not considered the members of a class*/
public class Car {
	/*you can not use key words as data types*/
	/* The variables defined below are Global Variables. Global variables are defined inside the class
	 * but are outside the functions in the class. A global variable can be accessed anywhere inside a class.
	 * The global variables in java are reffered to as instance variables. (instance = object, each object will also
	 * have these variables)
	 * These variabels are called instance variables because these can be accessed from instance(object) of this class.
	 * */
	int wheels = 4; //global variable
	int windows = 5; //global variable
	
	//function or in java it is called method
	void turnLeft() {
		/*Local variable is a variable which is defined inside the function and are not accessible outside this function*/
		@SuppressWarnings("unused")
		int speed = 80;
		System.out.println("Turning Left");
	}
	
	//function or in java it is called method
	void turnRight(){
		System.out.println("Turning Right");
	}
	void print(String car){
		System.out.println("Car = " +car);
	}
	

}
