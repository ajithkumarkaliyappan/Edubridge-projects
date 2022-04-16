import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSortMerg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sizeOfArray =5;
		System.out.println("Enter 5 elements in Array1");
		ArrayList<Integer> array1= new ArrayList<>();
		for(int i=0; i<sizeOfArray; i++) {
			array1.add(i, scanner.nextInt());
		}
		System.out.println(array1);
		System.out.println("Enter 5 elements in Array2");
		ArrayList<Integer> array2= new ArrayList<>();
		for(int j=0; j<sizeOfArray; j++) {
			array2.add(j, scanner.nextInt());
		}
		System.out.println(array2);
		
		int n1 = array1.size();
		int n2 = array2.size();
		
		UserMainCodeTwo userMainCodeTwo = new UserMainCodeTwo();
		System.out.println(userMainCodeTwo.SortMergedArrayList(array1 , array2,  n1, n2));
		
			
		
		scanner.close();
	}

}
