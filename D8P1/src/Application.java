/*1)string is an immutable object, once it gets assigned I can not change it, 
 *2) what java does is, it creates a memory for a string lets, say String1 = "Memory1"
 *3) and if I do String1 = "Memory2" then it just doesn;t over writes memory1 instead it creates
 *a new memory space
 *4) .equal methods compares the values and == compares the refrence object*/
public class Application {
	String s = "Hello World";
	String s1 = new String("Hello Java");
	String s2 = s +" "+s1;
	String s3 = "Hello World";
	String s4 = "HELlo WORLD";
	void testString() {
		System.out.println( "String s " +s);
		System.out.println("String s1 " +s1);
		System.out.println("String s2 " +s2);
		System.out.println("Char at 0: " +s.charAt(0));
		System.out.println("Concat: " +s.concat(s2));
		System.out.println("Index is " + s.indexOf("o"));
		System.out.println("Upper case of S: " + s.toUpperCase());
		System.out.println("Lower Case of S: " +s.toLowerCase());
		System.out.println("Sub string 0 to 3 of s: " + s.substring(0,3)); 
		System.out.println("Is equal? " + s.equals(s3));
		System.out.println("Is equal Ignore CasE? " +s.equalsIgnoreCase(s4));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = new Application();
		app.testString();
		
	}

}
class AA {
	void m1(){
		
	}
	void m2(){
		
	}
}
