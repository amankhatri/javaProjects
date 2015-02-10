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
		Area area = null;
		Rectangle rect = new Rectangle();
		rect.calculateArea();
		area.method1();
	}

}
