/*you can have set a priority using object.setPrority(some in on scale of 0 to 10). 10 being the highest
 * prioirty. However cpu may not obey that*/
public class MultiThreadApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a1 = new Addition("Thread-1");
		System.out.println("Starting Thread-1");
		a1.setPriority(1);
		a1.start();
		
		
		Addition a2 = new Addition("Thread-2");
		System.out.println("Starting Thread-2");
		a2.setPriority(4);
		a2.start();
		
		
		Addition a3 = new Addition("Thread-3");
		System.out.println("Starting Thread-3");
		a3.setPriority(10);
		a3.start();
		
		
		Addition a4 = new Addition("Thread-4");
		System.out.println("Starting Thread-4");
		a4.start();
		
		
		Addition a5 = new Addition("Thread-5");
		System.out.println("Starting Thread-5");
		a5.start();
		
	}

}
