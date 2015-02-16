import java.util.InputMismatchException;

/*finally block is always executed even if there are exceptions, and yes exceptions do 
 * give the control to main function however, it does so after execution of finally block*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Addition addOb = new Addition();
			try{
				addOb.add();
			} catch(InputMismatchException ImE){
				System.out.println("Enter correct Value");
			}
			System.out.println("After calling add..");
			//some code
			System.out.println("End of end of ");
	}

}
