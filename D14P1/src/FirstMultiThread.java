
public class FirstMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AplusB abObj = new AplusB(); /*main tells A calculate A+b*/
		EplusF efObj = new EplusF(); /*main tells B calculates E+B*/
		
		/*3) now we can make this application multi threaded by calling the start methods after the run method has been overriden
		 * 		Start method will start the thread by invoking its run() method */
		
		System.out.println("Step1 - calculating A+B");
		abObj.start();
		System.out.println("Step3 - calculating E+F");
		efObj.start();
		/*Remember main thread should wait for child thread to finish by using sleep method. however in real world we don't 
		 * know how long to wait, so we use object.join() method on threads and it will make main thread wait until child (abobj and 
		 * efobj) thread is finished*/
		try {
			//Thread.sleep(5000);
			abObj.join();
			efObj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
