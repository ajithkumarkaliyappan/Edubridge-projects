package stringencryption;

public class Function {

	public static String encryptingString(String str) {  //function to change the char in odd position value
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();

		for (int i =0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			if (i % 2 != 0)
			{                                   // checking the charaacter position whether it's odd or not
				if (c == 'z' || c == 'Z')
				{                                 // checkinh the char value
					c = (char) (c - 25);          // if it's z decrement by 25 to get 'a'
				} else
					c = (char) (c + 1);          //other than z it print next char 
				sb.append(c);

			}else
				sb.append(c);
			
		}
		return sb.toString();
		
	}

}
