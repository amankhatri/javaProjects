
public class EplusF extends Thread {
	void calculate() {
		int e = 10;
		int f = 20;
		int g = e+f;
		System.out.println("Step 4 Single Threaded E+F : " + g);
	}
	/*1) After extending thread 
	 *2) we should override run method. Any logic which needs to be processed parellely should be defined or called from run method  */
	public void run(){
		calculate();
	}
	
}
