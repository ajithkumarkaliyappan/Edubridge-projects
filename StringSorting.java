/*6.	Write a Java program to sort in ascending and descending order by length of the given array of strings.
Sample Output:
Original unsorted colors: [Green, White, Black, Pink, Orange, Blue, Champagne, Indigo, Ivory]
Sorted color (descending order): [Champagne, Orange, Indigo, Green, White, Black, Ivory, Pink, Blue]
Sorted color (ascending order): [Pink, Blue, Green, White, Black, Ivory, Orange
*/
package stringassignments;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number of colors you want to sort");
		int n= sn.nextInt();
		String tempVar = null;
		String tempVar1 = null;
		String[] color = new String[n];
		for(int i=0; i<n ; i++) {
			System.out.print("Enter the color " + i +" : ");
			color[i] = sn.next();
			System.out.println();
		}
		int size = color.length;
		
        System.out.println("unsorted colors of original array: ");    
        for (int i = 0; i < color.length; i++) {     
            System.out.print(color[i] + " ");    
        }    
        System.out.println();    
        for(int i = 0; i<size-1; i++)   
        {  
        for (int j = i+1; j<color.length; j++)   
        {  
        // Descending order
        if(color[i].length() > color[j].length())   
        {  
        //swapping array elements  
         tempVar = color[i];  
        color[i] = color[j];  
        color[j] = tempVar;  
        }  
        }  
        }  
        System.out.print("Sorted color (Descending order) : ");    
        System.out.println(Arrays.toString(color));   
        //Ascending order
        for (int i = 0; i < color.length; i++) {     
            System.out.print(color[i] + " ");    
        }    
        System.out.println();    
        for(int i = 0; i<size-1; i++)   
        {  
        for (int j = i+1; j<color.length; j++)   
        {  
        // Descending order
        if(color[i].length() < color[j].length())   
        {  
        //swapping array elements  
         tempVar1 = color[i];  
        color[i] = color[j];  
        color[j] = tempVar1;  
        }  
        }  
        }  
        System.out.print("Sorted color (Ascending order) : ");    
        System.out.println(Arrays.toString(color));   
		
		sn.close();
	}

}
