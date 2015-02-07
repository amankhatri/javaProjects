
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		add.a = 10;
		add.b = 20;
		int result = add.add();
		System.out.println("The returned value is " +result);
	}

}
