/*2. String Encryption
Given an input as string and write code to encrypt the given string using
following rules and return the encrypted string:
1. Replace the characters at odd positions by next character in alphabet.
2. Leave the characters at even positions unchanged.
Note:
- If an odd position charater is 'z' replace it by 'a'.
- Assume the first character in the string is at position 1.
Include a class UserMainCode with a static method encrypt which accepts a
string.
The return type of the output is the encrypted string.
Create a Main class which gets string as an input and call the static
method encrypt present in the UserMainCode.
Input and Output Format:
Input is a string .
Output is a string.
Sample Input 1:
curiosity
Sample Output 1:
dusipsjtz
Sample Input 2:
zzzz
Sample Output 2:
azaz*/

package stringencryption;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sn.nextLine();
    
        System.out.println("the encrypted string is :"+ Function.encryptingString(str));
        sn.close();
	}

}
