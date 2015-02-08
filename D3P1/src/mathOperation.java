
public class mathOperation {
/*if you want to initialize anything use constructors. Constructors are called when objects are created. we use
 * constructors when we need to perform initialization or a common code needs to be executed before function calls */
	int x=0; //global or instance variable
	int b=0; //global or instance variable
	mathOperation(int x, int y) {
		/*by using this we are telling java that left hand side variable is an instance variable and the right
		 * hand side is local variable.*/
		this.x = x;
		b = y;
	}
	int add(){
		return (x+b);
	}
	int substract(){
		return(x-b);
	}
}
