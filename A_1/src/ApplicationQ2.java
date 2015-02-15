
public class ApplicationQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager me = new Manager();
		me.hire("newbie");
		me.fire("nobody");

	}

}
abstract class Employee{
	String name;
	public abstract float calcIncome();
}
/*Remember you always have to add unimplemented method to child class if the parent class
 * is abstract*/
class Manager extends Employee{

	@Override
	public float calcIncome() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void hire(String who){
		System.out.println(who +" hired by " +name);
	}
	
	public void fire(String who){
		System.out.println(who + " fired by " +name);
	}
}
