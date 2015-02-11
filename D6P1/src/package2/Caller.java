/*Remember: The pakckage declaration should be the first line in ava code
 * Do not always use "*" . Use it only if you are using all the classes from the packages
 * if you import all the classes, all the classes will be loaded in the memory and will be
 * compiled, so it reduces the efficiency of computer*/

package package2;//package declaration should be the first line in the code
import package1.MyClass;
import package1.package11.*; //import all the classes from package1.package11
public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();
		MyClass.main(null);
	}
	void method2() {
		System.out.println("Method2 Package2");
	}

}
