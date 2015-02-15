
public class ApplicationQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class A {
	final public int GetResult(int a , int b){
		return 0;
	}
}
/*you can not override the final method or variable in child class*/
class B extends A {
	public int GetResult(int a, int b){
		return 0;
	}
}

