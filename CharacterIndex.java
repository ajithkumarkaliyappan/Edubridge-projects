//1.	Write a Java program to get the character at the given index within the String
package stringassignments;

import java.util.Scanner;

public class CharacterIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sn.next();
		System.out.println("Enter the character index that you want to print");
		int i = sn.nextInt();
		char character = str.charAt(i);
		System.out.println("The character at the give index "+ i +" is :"+" "+character);
		
		
		sn.close();
	}

}
