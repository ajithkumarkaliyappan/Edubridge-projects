//check a given string is palindrome or not 

package stringassignments;

import java.util.Scanner;

public class Paliandrome {

	static boolean isPalindrome(String str) {

		int i = 0; // Beginning of string
		int j = str.length() - 1; // end of string

		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the String to check :");
		String str = sn.next();
		String str1 = sn.next();
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		
		if(isPalindrome(str)) {
			System.out.println(str + " is a PALINDROME");
		}else {
			System.out.println(str + " is a not a PALINDROME");
		}
		
		if(isPalindrome(str1)) {
			System.out.println(str1 + " is a PALINDROME");
		}else {
			System.out.println(str1 + " is a not a PALINDROME");
		}
		

		sn.close();
	}

}
