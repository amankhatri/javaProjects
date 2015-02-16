import java.util.Arrays;

public class AnagramQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Software";// word against which we are checking
		String s2 = "swear lft";// word to determine if it is Anangram
		System.out.println("isAnagram " + AnagramQ4.isAnagram(s1, s2));

	}

	public static boolean isAnagram(String s1, String s2) {
		char[] ca1s1 = s1.toLowerCase().toCharArray();
		char[] ca2s3 = s2.replaceAll("\\s+", "").toLowerCase().toCharArray();
		Arrays.sort(ca1s1);
		Arrays.sort(ca2s3);
		if (Arrays.toString(ca1s1).equals(Arrays.toString(ca2s3))) {
			return true;
		} else {
			return false;
		}
	}

}
