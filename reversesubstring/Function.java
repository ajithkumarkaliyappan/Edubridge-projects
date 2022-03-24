package reversesubstring;

public class Function {
	public static String reverseSubString(StringBuffer sb, int a, int b) {
		StringBuffer sb1=new StringBuffer();
		String ss= sb1.append(sb.substring(a, a+b)).toString(); //printing the string value in start and end number
		return ss;
		
	}
}
