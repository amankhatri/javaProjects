/*redifining a method in child class is called overriding*/

public class Application {
	public static void main(String args[]){
		Area area = new Area(); //super class
		Rectangle rect = new Rectangle(); //sub class 1
		Square sqr = new Square(); //sub class2
		rect.calculateArea();
		sqr.calculateArea();
		
		/*you can also do this*/
		/*we SuperClass class = new SubClass*/
		Area area1 = new Rectangle();
		area1.calculateArea();// calls the method from sub class
		area1 = new Square();
		area1.method1();
		
		
		
		/*Using the object of Super class.  We are able to call the overridden 
		 * method
		 * this reduces the number of objects used for call the oveeriden method of 
		 * sub class
		 * if we can call a method of sub class using the object of super class 
		 * then the concept is called as Dynamic Polymorphism*/
		
	}
}
