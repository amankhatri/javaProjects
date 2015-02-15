
public class ApplicationQ12_13_14_15 extends MineBase{
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Q12*/
		System.out.println("Value of i " +i);
		/*Q15*/
		int[] ar = new int[5];
		for(i=0;i<ar.length;i++){
			System.out.println("Array element " + i +" is " + ar[i]);
		}
		
	}
	@Override /*Q15 error*/
	void amethod() {
		// TODO Auto-generated method stub
		/*this method was not implemented*/
		
	}
	

}
/*Q14*/
public class
/*Q15*/
abstract class MineBase{
	abstract void amethod();
	static int i;
}
