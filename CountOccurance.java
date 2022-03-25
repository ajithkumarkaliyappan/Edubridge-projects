//4.	Write a Java program to counts occurrences of a certain character in a given string
package stringassignments;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sn.next();
		System.out.println("Enter the character that you want to check the count of occurance :");
		char ch = sn.next().charAt(0);
		int TotalOccurance = 0;
		for(int i=0; i<str.length();i++) {
			char ch1 = str.charAt(i);
			if(ch == ch1) {
				TotalOccurance += 1;
			}
		}
		System.out.println("The total occurance of character "+ ch + " is "+ TotalOccurance);
		sn.close();
	}

}
