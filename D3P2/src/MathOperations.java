/* java understand polymorphism based on overloading. Polymorphism means
 * using same function to accomplish different tasks. That is java supports multiple methods with same name. */
public class MathOperations {
	
	int add(int x , int y){
		return x+y;
	}
	
	int add3(int x, int y, int z){
		return x+y+z;
	}
	int add(int a, int b, int c, int d){
		return a+b+c+d;
	}
	int add(int array[]){
		int sum = 0;
		for(int value: array) {
			sum = sum + value;
		}
		return sum;
	}

}
