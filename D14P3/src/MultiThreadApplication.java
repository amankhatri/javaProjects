/*Creating a thread using runnable.
 * Runnable is an interface in java, if we need to create a Thread there are 2 ways:
 * 1) By extending the Thread class
 * 2) By Implementing Runnable interface
 * Both are used for Same Purpose
 * Runnable interface has one method called run() which needs to be overriden.
 * 1) When we implement using runnable, we create a object of thread class and we pass an object of current class, that is Addition class, 
 * and the name of the thread. 
 * 2) After that we start the tread t.start method.
 * When we create an object of the Addition call, and we create a thread object inside the same class. So when the object 
 * of addition is created, since the thread is created in the constructor so , the thread object
 * in the class automatically calls start method in constructor and which in turns called run method*/
public class MultiThreadApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a1 = new Addition("Thread-1");
		System.out.println("Starting Thread-1");
		
		
		
		Addition a2 = new Addition("Thread-2");
		System.out.println("Starting Thread-2");
		
		
		
		Addition a3 = new Addition("Thread-3");
		System.out.println("Starting Thread-3");
	
		
		
		Addition a4 = new Addition("Thread-4");
		System.out.println("Starting Thread-4");
		
		
		
		Addition a5 = new Addition("Thread-5");
		System.out.println("Starting Thread-5");
		
		
	}

}
