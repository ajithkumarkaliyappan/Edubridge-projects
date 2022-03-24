package trimchar;

public class Function {

	public static String getTrimString(String str) {
		// TODO Auto-generated method stub
		//String str1 = str.replaceAll(" ", " ");
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<=str.length(); i=i+2) {
			sb.append(str.charAt(i));
		}
		String str1 = sb.toString();
		return str1;
	}

}
