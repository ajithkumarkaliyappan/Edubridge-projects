import java.util.ArrayList;
import java.util.Scanner;

public class RemoveThirdMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of elements add to arrayList");
		int noOfElements = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println("Enter the value ");
		for(int i=0; i<noOfElements; i++) {
			arrayList.add(i, scanner.nextInt());
		}
		
		System.out.println(arrayList);
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");
		
		UserMainCodeOne userMainCode= new UserMainCodeOne();
		System.out.println(userMainCode.removeMultipliesOfThree(arrayList));
		
		
		
		scanner.close();
	}

}
