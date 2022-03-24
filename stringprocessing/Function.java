package stringprocessing;

public class Function {

	public static String moveX(String s) {
		// TODO Auto-generated method stub
		String s1 = s.replaceAll(s, s);
		String s2 = s.replaceAll(s, s1);
				s1 += s2;
		return s1;
	}

}
