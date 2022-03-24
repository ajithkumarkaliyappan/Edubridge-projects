/*2. Reverse SubString
Given a string, startIndex and length, write a program to extract the
substring from right to left. Assume the last character has index 0.
Include a class UserMainCode with a static method “reverseSubstring” that
accepts 3 arguments and returns a string. The 1st argument corresponds to
the string, the second argument corresponds to the startIndex and the
third argument corresponds to the length.
Create a class Main which would get a String and 2 integers as input and
call the static method reverseSubstring present in the UserMainCode.
Input and Output Format:
The first line of the input consists of a string.
The second line of the input consists of an integer that corresponds to
the startIndex.
The third line of the input consists of an integer that corresponds to
the length of the substring.
Sample Input:
rajasthan
2
3
Sample Output:
hts
*/
package reversesubstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s1 = sc.nextLine();
		System.out.println("beginning index of Reverse string : ");
		int a = sc.nextInt();
		System.out.println("ending index of reverse string :");
		int b = sc.nextInt();
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse(); // Reverse the given string
		
		System.out.println("string : " + Function.reverseSubString(sb, a, b));
		sc.close();
	}

}
