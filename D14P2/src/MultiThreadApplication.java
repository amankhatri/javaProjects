/*You always create thread in a loop not manually. The threads are called automatically in no perticular order. CPU decides which
 * thread to run first*/
public class MultiThreadApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a1 = new Addition("Thread-1");
		System.out.println("Starting Thread-1");
		a1.start();
		
		
		Addition a2 = new Addition("Thread-2");
		System.out.println("Starting Thread-2");
		a2.start();
		
		
		Addition a3 = new Addition("Thread-3");
		System.out.println("Starting Thread-3");
		a3.start();
		
		
		Addition a4 = new Addition("Thread-4");
		System.out.println("Starting Thread-4");
		a4.start();
		
		
		Addition a5 = new Addition("Thread-5");
		System.out.println("Starting Thread-5");
		a5.start();
		
	}

}
