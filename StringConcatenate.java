//5.	Write a Java program to concatenate a given string with itself of 
//a given number of times.
package stringassignments;

import java.util.Scanner;

public class StringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sn.next();
		System.out.println("Enter homw many times you want to concatenate the given string :");
		int n = sn.nextInt();
		String str1 = null;
		for(int i=0; i<=n; i++) {
			 str1 = str.concat(str);
		}
		System.out.println("The concatenated string is : "+ str1);
		
		sn.close();
	}
}
