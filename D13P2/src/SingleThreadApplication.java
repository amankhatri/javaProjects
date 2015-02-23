
public class SingleThreadApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*the main method is it self a Thread. 
		 * Any class which has a main method is  single threaded class. 
		 *
		 * 1) Request goes to cpu , which takes say 200 ms
		 * 2) remember other app behind the scene is also working so cpu will swap that app 
		 * with the execution of this code and then it will reswap after printing the result*/
		for(int i = 1; i<=5;i++){
			try {
				Thread.sleep(5000);//5 secs
				System.out.println("I = " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
	}

}
