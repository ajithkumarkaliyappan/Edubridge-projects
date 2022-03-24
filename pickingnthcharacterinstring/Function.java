package pickingnthcharacterinstring;

public class Function {
	public static String formString(String s1[], int n, int a) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<n; i++) {
			if(s1[i].length() >=a) {
				sb.append(s1[i].substring(a-1, a));
			}else
				sb.append("%");
		}
		return sb.toString();
	}
}
