import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the array row and column size");
		int rSize = sn.nextInt();
		int cSize = sn.nextInt();
		int[][] array1 = new int[rSize][cSize];
		System.out.println("Enter the 1st array values");
		for(int i=0; i<rSize; i++) {
			for(int j=0; j<cSize; j++) {
				array1[i][j]=sn.nextInt();
			}
		}
		int[][] array2 = new int[rSize][cSize];
		System.out.println("Enter the 2nd array values");
		for(int i=0; i<rSize; i++) {
			for(int j=0; j<cSize; j++) {
				array2[i][j]=sn.nextInt();
			}
		}
		//array addition
		int[][] sum=new int[rSize][cSize];
		for(int i=0; i<rSize; i++) {
			for(int j=0; j<cSize; j++) {
				sum[i][j]=array1[i][j] + array2[i][j];
			}
		}
		for(int[] result : sum ) {
			for(int add : result) {
				System.out.print(add+" ");
			}
			System.out.println();
		}
	}

}
