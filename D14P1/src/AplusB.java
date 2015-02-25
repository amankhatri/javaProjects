
public class AplusB extends Thread {

	void calculate() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Step 2 Single Threaded A+B : " + c);
	}
	/*1) After extending thread 
	 *2) we should override run method. Any logic which needs to be processed parellely should be defined or called from run method  */
	public void run(){
		calculate();
	}
	
}
