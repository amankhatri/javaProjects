/*String Replacement, 
 * String Declaration 
 *String Comparison*/
public class ApplicationQ5Q6Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Declaration of String Object Method 1 */
		String s1 = new String("Java Bean EJB, JSF, JSP");
		/* Declaration of String Object method 2 */
		String s2 = "Java Bean EJB, JF, JSP";
		/* String Comparision */
		System.out.println("Compare Strings " + s1.compareTo(s2));
		System.out.println("Replacement: " + s1.replace('J', 'W'));
	}

}
