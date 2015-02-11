
/*Encapsulation uses below 3 keywords
 * 1) Public: EveryWhere
 * 2) Private: A private method cannot be accessed outside that class
 * 3) Protected: is accessible by any child class even if it is outside the package
 * 4) Default: It is not a keyword. This is one of the of the access specifier. Any method
 * 	defined as default can be accessed outside the class in same package but not outside the 
 * 	package*/
package encapsulation;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		add.test();
	}

}
