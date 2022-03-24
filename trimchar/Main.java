/*1. String Processing - TrimCat
Write a program to read a string and return a new string which is made of
every alternate characters starting with the first character. For example
NewYork will generate Nwok, and Samurai will generate Smri.
Include a class UserMainCode with a static method getAlternateChars which
accepts the string. The return type is the modified string.
Create a Class Main which would be used to accept the string and call the
static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of string.
Refer sample output for formatting specifications.
Sample Input 1:
Hello
Sample Output 1:
Hlo*/

package trimchar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the word to trim :");
		String str = sn.nextLine();
		
		System.out.println(" the trimmed string is :"+ Function.getTrimString(str));
		sn.close();
	}

}
