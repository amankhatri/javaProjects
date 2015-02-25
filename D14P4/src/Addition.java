
public class Addition extends Thread {
	
	Addition(String name){
		super(name);//Super(name) gets passed on the Thread, which becomes the name of the thread, and we can retrieve it using this.getName()
	}
	void add() {
		try {
			System.out.println("StartedAdding Stuff");
			for(int i=0;i<5;i++){
				System.out.println(this.getName() + ": " +i);
				Thread.sleep(5000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ending Thread " +this.getName());
	}
	public void run(){
		add();
	}

}
