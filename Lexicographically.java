//3.	Write a Java program to compare two strings lexicographically. Two strings are lexicographically
//equal if they are the same length and contain the same characters in the same positions
package stringassignments;

import java.util.Scanner;

public class Lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = sn.next();
		System.out.println("Enter the second string");
		String str2 = sn.next();
		 int result = str1.compareTo(str2);
		 if(result  == 0) {
			 System.out.println("the lenght of the string "+ str1 +" equal to " + str2);
		 }else
			 System.out.println("the lenght of the string "+ str1 +" is not equal to " + str2);
		
		sn.close();
	}

}
