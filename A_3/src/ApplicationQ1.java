public class ApplicationQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "01234";
		String s2 = "56789";
		String s3 = "01234543";
		String s6 = " trim this ";
		System.out.println("charAt(int index):  " + s1.charAt(2));
		System.out.println("Concat(string suffix): " + s1.concat(s2));
		System.out.println("endsWith s1 ends with 4?: " + s1.endsWith("4"));
		System.out.println("equals " + s1.equals(s2));
		System.out.println("indexof: " + s1.indexOf('4'));
		System.out.println("lastIndexof: " + s3.lastIndexOf('4', 8));
		System.out.println("replace: " + s3.replace('4', 'r'));
		System.out.println("substring: " + s6.replaceAll("\\s", ""));
		System.out.println("substring(int beginners): " + s2.substring(3));
		System.out
				.println("substring(int begin, int end " + s2.substring(3, 5));
		System.out.println("Trim: " + s6.trim());

	}
}
