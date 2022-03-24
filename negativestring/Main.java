/*7.Negative String
Given a string input, write a program to replace every appearance of the
word "is" by "is not".
If the word "is" is immediately preceeded or followed by a letter no
change should be made to the string .
Include a class UserMainCode with a static method “negativeString” that
accepts a String arguement and returns a String.
Create a class Main which would get a String as input and call the static
method negativeString present in the UserMainCode.
Input and Output Format:
Input consists of a String.
Output consists of a String.
Sample Input 1:
This is just a misconception
Sample Output 1:
This is not just a misconception
Sample Input 2:
Today is misty
Sample Output 2:
Today is not misty*/

package negativestring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sn.nextLine();
		System.out.println("Negative String : " + Function.negativeString(str));
		sn.close();
	}

}
