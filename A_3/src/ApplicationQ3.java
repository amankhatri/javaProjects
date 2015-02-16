/*Displays initials*/
public class ApplicationQ3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = "First Middle Last";
		char[] name = Name.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(name[0]);
		for(int i = 0;i<name.length;i++){
			if(name[i]==' '){
				sb.append(name[i+1]);
			}
		}
		System.out.println("Initials = " + sb.toString());
	}

}
