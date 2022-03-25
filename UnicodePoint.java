//2.	Write a Java program to get the character (Unicode code point) at the given index within the String
// unicode point - ASCII value of the character at the given index of the string

package stringassignments;

import java.util.Scanner;

public class UnicodePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the String to check");
		 String input = sn.next();  
		 System.out.println("Enter the character index to print the ASCII value of that character : ");  
		 int index = sn.nextInt();  
		 System.out.println(input.codePointAt(index)); 
		 sn.close();
	}

}
